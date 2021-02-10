package org.ogomez.practica.movies.serializers;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.ogomez.practica.movies.model.ratedmovie.Payload;
import org.ogomez.practica.movies.model.movie.Movie;
import org.ogomez.practica.movies.model.rating.Rating;

public final class MovieCustomSerdes {

  public static Serde<Movie> Movie() {
    return new MovieSerde();
  }

  public static Serde<Rating> Rating() {
    return new RatingSerde();
  }

  public static Serde<Payload> RatedMovie() {
    return new RatedMovieSerde();
  }

  public static final class MovieSerde extends Serdes.WrapperSerde<Movie> {

    public MovieSerde() {
      super(new MovieSerializer(), new MovieDeserializer());
    }
  }

  public static final class RatingSerde extends Serdes.WrapperSerde<Rating> {

    public RatingSerde() {
      super(new RatingSerializer(), new RatingDeserializer());
    }
  }

  public static final class RatedMovieSerde extends Serdes.WrapperSerde<Payload> {

    public RatedMovieSerde() {
      super(new RatedMovieSerializer(), new RatedMovieDeserializer());
    }
  }
}
