package com.catalystdevworks.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ClinicalTrial extends NamedBaseEntity  {

    private LocalDate startDate;

    private LocalDate endDate;

    private String clinicalTrialDescription;

    private String clinicalTrialDetail;

    @ManyToOne
    private ClinicalTrialType clinicalTrialType;

    @ManyToOne
    private ClinicalTrialPhase clinicalTrialPhase;

    @ManyToMany
    private List<PrincipalInvestigator> principalInvestigators;

    @ManyToMany
    private List<Sponsor> sponsors;

    @ManyToMany
    private List<Tag> tags;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getClinicalTrialDescription() {
        return clinicalTrialDescription;
    }

    public void setClinicalTrialDescription(String clinicalTrialDescription) {
        this.clinicalTrialDescription = clinicalTrialDescription;
    }

    public String getClinicalTrialDetail() {
        return clinicalTrialDetail;
    }

    public void setClinicalTrialDetail(String clinicalTrialDetail) {
        this.clinicalTrialDetail = clinicalTrialDetail;
    }

    public ClinicalTrialType getClinicalTrialType() {
        return clinicalTrialType;
    }

    public void setClinicalTrialType(ClinicalTrialType clinicalTrialType) {
        this.clinicalTrialType = clinicalTrialType;
    }

    public ClinicalTrialPhase getClinicalTrialPhase() {
        return clinicalTrialPhase;
    }

    public void setClinicalTrialPhase(ClinicalTrialPhase clinicalTrialPhase) {
        this.clinicalTrialPhase = clinicalTrialPhase;
    }

    public List<PrincipalInvestigator> getPrincipalInvestigators() {
        return principalInvestigators;
    }

    public void setPrincipalInvestigators(List<PrincipalInvestigator> principalInvestigators) {
        this.principalInvestigators = principalInvestigators;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


}
