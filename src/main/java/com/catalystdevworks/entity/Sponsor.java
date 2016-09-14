package com.catalystdevworks.entity;

import javax.persistence.Entity;

@Entity
public class Sponsor extends NamedBaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
