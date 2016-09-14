package com.catalystdevworks.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class ClinicalTrial extends NamedBaseEntity  {
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(length = 2000)
    private String clinicalTrialDescription;

    @Column(length = 2000)
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

    @ManyToOne
    private TargetGroupAttribute targetGroup;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
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

    public TargetGroupAttribute getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(TargetGroupAttribute targetGroup) {
        this.targetGroup = targetGroup;
    }
}
