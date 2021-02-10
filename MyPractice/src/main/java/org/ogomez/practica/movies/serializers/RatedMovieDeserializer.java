package org.ogomez.practica.movies.serializers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.ogomez.practica.movies.model.ratedmovie.Payload;

import java.io.IOException;
import java.util.Map;

public class RatedMovieDeserializer implements Deserializer<Payload> {

  @Override
  public void configure(Map<String, ?> configs, boolean isKey) {

  }

  @Override
  public Payload deserialize(String value, byte[] bytes) {

    ObjectMapper objectMapper = new ObjectMapper();
    Payload pojo = null;

    try {
      pojo = objectMapper.readValue(bytes, Payload.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return pojo;
  }

  @Override
  public void close() {

  }
}
