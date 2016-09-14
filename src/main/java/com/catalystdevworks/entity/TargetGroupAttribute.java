package com.catalystdevworks.entity;

import javax.persistence.Entity;

@Entity
public class TargetGroupAttribute extends NamedBaseEntity {

    private int minAge;

    private int maxAge;

    private String targetGroupDescription;

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getTargetGroupDescription() {
        return targetGroupDescription;
    }

    public void setTargetGroupDescription(String targetGroupDescription) {
        this.targetGroupDescription = targetGroupDescription;
    }
}
