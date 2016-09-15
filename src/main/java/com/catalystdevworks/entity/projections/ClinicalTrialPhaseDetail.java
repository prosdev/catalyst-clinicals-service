package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.ClinicalTrialPhase;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineClinicalTrialPhase", types = {ClinicalTrialPhase.class})
interface ClinicalTrialPhaseDetail {
    String getId();
    String getName();
    String getClinicalTrialPhaseDescription();
}
