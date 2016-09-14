package com.catalystdevworks.entity;

import javax.persistence.Entity;

@Entity
public class PrincipalInvestigator extends NamedBaseEntity {

    private String researchBackground;

    private String educationalQualifications;

    public String getResearchBackground() {
        return researchBackground;
    }

    public void setResearchBackground(String researchBackground) {
        this.researchBackground = researchBackground;
    }

    public String getEducationalQualifications() {
        return educationalQualifications;
    }

    public void setEducationalQualifications(String educationalQualifications) {
        this.educationalQualifications = educationalQualifications;
    }
}
