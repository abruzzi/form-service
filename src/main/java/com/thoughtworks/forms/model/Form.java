package com.thoughtworks.forms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.List;

@Document(collection="forms")
public class Form {
    @Id
    private String id;

    @org.springframework.data.mongodb.core.mapping.Field
    private Object structure;

    public Object getStructure() {
        return structure;
    }

    public void setStructure(Object structure) {
        this.structure = structure;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
