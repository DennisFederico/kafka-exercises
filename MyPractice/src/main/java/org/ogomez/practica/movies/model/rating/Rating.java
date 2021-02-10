
package org.ogomez.practica.movies.model.rating;

import org.ogomez.practica.movies.model.schema.Schema;

import java.util.HashMap;
import java.util.Map;

public class Rating {

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
