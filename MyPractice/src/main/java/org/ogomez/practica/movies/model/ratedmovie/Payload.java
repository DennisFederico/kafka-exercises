package org.ogomez.practica.movies.model.ratedmovie;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Payload implements Serializable {

  private String tconst;
  private String originalTitle;
  private float averageRating;
  private int numVotes;


  public Payload() {}

  public Payload(String tconst, String originalTitle, float averageRating, int numVotes) {
    this.tconst = tconst;
    this.originalTitle = originalTitle;
    this.averageRating = averageRating;
    this.numVotes = numVotes;
  }


  public String getTconst() {
    return tconst;
  }

  public void setTconst(String tconst) {
    this.tconst = tconst;
  }

  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public float getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(float averageRating) {
    this.averageRating = averageRating;
  }

  public int getNumVotes() {
    return numVotes;
  }

  public void setNumVotes(int numVotes) {
    this.numVotes = numVotes;
  }

}
