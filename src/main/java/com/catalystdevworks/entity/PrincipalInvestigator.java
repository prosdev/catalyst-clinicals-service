package com.catalystdevworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PrincipalInvestigator extends BaseEntity {

    private String firstName;

    private String lastName;

    @Column(length = 2000)
    private String researchBackground;

    private String educationalQualifications;

    private String profileImage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

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
