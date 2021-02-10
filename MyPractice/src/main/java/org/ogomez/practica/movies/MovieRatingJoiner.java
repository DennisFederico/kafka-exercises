package org.ogomez.practica.movies;

import org.apache.kafka.streams.kstream.ValueJoiner;
import org.ogomez.practica.movies.model.movie.Movie;
import org.ogomez.practica.movies.model.ratedmovie.Payload;
import org.ogomez.practica.movies.model.rating.Rating;

public class MovieRatingJoiner implements ValueJoiner<Rating, Movie, Payload> {

  @Override
  public Payload apply(Rating rating, Movie movie) {
    return new Payload(movie.getPayload().getTconst(), movie.getPayload().getOriginalTitle(), rating.getPayload().getAverageRating(),
        rating.getPayload().getNumVotes());
  }
}
