package com.catalystdevworks.entity;

import javax.persistence.Entity;

@Entity
public class ClinicalTrialType extends NamedBaseEntity {

    private String clinicalTrialTypeDescription;

    public String getClinicalTrialTypeDescription() {
        return clinicalTrialTypeDescription;
    }

    public void setClinicalTrialTypeDescription(String clinicalTrialTypeDescription) {
        this.clinicalTrialTypeDescription = clinicalTrialTypeDescription;
    }
}
