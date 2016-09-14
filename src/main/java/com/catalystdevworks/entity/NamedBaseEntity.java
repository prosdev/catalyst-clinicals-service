package com.catalystdevworks.entity;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedBaseEntity extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
