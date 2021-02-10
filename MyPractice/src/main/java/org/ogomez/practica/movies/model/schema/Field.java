
package org.ogomez.practica.movies.model.schema;

import java.util.HashMap;
import java.util.Map;

public class Field {

    private String type;
    private Boolean optional;
    private String field;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }



}
