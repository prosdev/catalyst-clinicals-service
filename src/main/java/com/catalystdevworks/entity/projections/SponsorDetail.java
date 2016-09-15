package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.Sponsor;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineSponsorDetail", types = {Sponsor.class})
interface SponsorDetail {
    String getId();
    String getName();
    String getSponsorLogo();
    String getDescription();


}
