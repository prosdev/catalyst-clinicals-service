package com.catalystdevworks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sponsor extends NamedBaseEntity {

    private String sponsorLogo;

    @Column(length = 2000)
    private String description;

    public String getSponsorLogo() {
        return sponsorLogo;
    }

    public void setSponsorLogo(String sponsorLogo) {
        this.sponsorLogo = sponsorLogo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
