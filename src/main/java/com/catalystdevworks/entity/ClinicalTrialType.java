package com.catalystdevworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClinicalTrialType extends NamedBaseEntity {

    @Column(length = 2000)
    private String clinicalTrialTypeDescription;

    public String getClinicalTrialTypeDescription() {
        return clinicalTrialTypeDescription;
    }

    public void setClinicalTrialTypeDescription(String clinicalTrialTypeDescription) {
        this.clinicalTrialTypeDescription = clinicalTrialTypeDescription;
    }
}
