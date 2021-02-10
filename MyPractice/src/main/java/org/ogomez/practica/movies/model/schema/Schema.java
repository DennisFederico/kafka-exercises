
package org.ogomez.practica.movies.model.schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schema {

    private String type;
    private List<Field> fields = null;
    private Boolean optional;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
