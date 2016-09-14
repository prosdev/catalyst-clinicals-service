package com.catalystdevworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClinicalTrialPhase extends NamedBaseEntity {

    @Column(length = 2000)
    private String clinicalTrialPhaseDescription;

    public String getClinicalTrialPhaseDescription() {
        return clinicalTrialPhaseDescription;
    }

    public void setClinicalTrialPhaseDescription(String clinicalTrialPhaseDescription) {
        this.clinicalTrialPhaseDescription = clinicalTrialPhaseDescription;
    }
}
