package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.ClinicalTrialType;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineClinicalTrialType", types = {ClinicalTrialType.class})
interface ClinicalTrialTypeDetail {
    String getId();
    String getName();
    String getClinicalTrialTypeDescription();
}
