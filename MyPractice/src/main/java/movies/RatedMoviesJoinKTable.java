package movies;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;
import org.ogomez.practica.movies.model.Movie;
import org.ogomez.practica.movies.model.RatedMovie;
import org.ogomez.practica.movies.model.Rating;
import org.ogomez.practica.movies.serializers.MovieCustomSerdes;

public class RatedMoviesJoinKTable {

  public static void main(String[] args) {

    MovieTopology.createTopics();

    final StreamsBuilder builder = new StreamsBuilder();
    final MovieRatingJoiner movieRatingJoiner = new MovieRatingJoiner();

    KStream<String, Movie> movieStream = builder.stream(MovieTopology.MOVIES_TOPIC,
        Consumed.with(Serdes.String(), MovieCustomSerdes.Movie()))
        .map((key, movie) ->
            new KeyValue<>(movie.getId(), movie));
    movieStream.to(MovieTopology.REKEYED_MOVIES_TOPIC,
        Produced.with(Serdes.String(), MovieCustomSerdes.Movie()));

    KTable<String, Movie> movies = builder.table(MovieTopology.REKEYED_MOVIES_TOPIC,
        Consumed.with(Serdes.String(), MovieCustomSerdes.Movie()));

    KStream<String, Rating> ratings = builder.stream(MovieTopology.RATINGS_TOPIC,
        Consumed.with(Serdes.String(), MovieCustomSerdes.Rating()));

    KStream<String, RatedMovie> ratedMovies = ratings.join(movies, movieRatingJoiner);
    ratedMovies.print(Printed.toSysOut());
    ratedMovies.to(MovieTopology.RATED_MOVIES_TOPIC,
        Produced.with(Serdes.String(), MovieCustomSerdes.RatedMovie()));

    Topology topology = builder.build();
    final KafkaStreams streams = new KafkaStreams(topology,
        MovieTopology.createStreamsConfigProperties("moviesJoin"));
    streams.cleanUp();

    streams.start();

    Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
  }


}
