package com.catalystdevworks.entity;

import javax.persistence.Entity;

@Entity
public class ClinicalTrialPhase extends NamedBaseEntity {

    private String clinicalTrialPhaseDescription;

    public String getClinicalTrialPhaseDescription() {
        return clinicalTrialPhaseDescription;
    }

    public void setClinicalTrialPhaseDescription(String clinicalTrialPhaseDescription) {
        this.clinicalTrialPhaseDescription = clinicalTrialPhaseDescription;
    }
}
