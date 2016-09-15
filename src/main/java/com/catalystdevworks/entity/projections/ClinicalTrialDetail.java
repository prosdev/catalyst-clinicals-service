package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.ClinicalTrial;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;
import java.util.List;

@Projection(name = "inlineClinicalTrial", types = {ClinicalTrial.class})
interface ClinicalTrialDetail {
    String getId();
    String getName();
    Date getStartDate();
    Date getEndDate();
    String getClinicalTrialDescription();
    String getClinicalTrialDetail();
    ClinicalTrialTypeDetail getClinicalTrialType();
    ClinicalTrialPhaseDetail getClinicalTrialPhase();
    TargetGroupAttributeDetail getTargetGroup();
    List<PrincipalInvestigatorDetail> getPrincipalInvestigators();
    List<SponsorDetail> getSponsors();
    List<TagDetail> getTags();
}
