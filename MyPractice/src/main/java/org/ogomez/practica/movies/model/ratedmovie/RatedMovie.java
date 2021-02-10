
package org.ogomez.practica.movies.model.ratedmovie;

import org.ogomez.practica.movies.model.rating.Payload;
import org.ogomez.practica.movies.model.schema.Schema;

public class RatedMovie {

    private Schema schema;
    private Payload payload;

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

}
