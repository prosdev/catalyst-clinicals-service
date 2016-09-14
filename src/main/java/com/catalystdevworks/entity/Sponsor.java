package com.catalystdevworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sponsor extends NamedBaseEntity {

    @Column(length = 2000)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
