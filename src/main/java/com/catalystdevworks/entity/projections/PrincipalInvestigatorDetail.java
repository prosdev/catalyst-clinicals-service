package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.PrincipalInvestigator;
import com.catalystdevworks.entity.TargetGroupAttribute;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlinePrincipalInvestigatorDetail", types = {PrincipalInvestigator.class})
interface PrincipalInvestigatorDetail {
    String getId();
    String getFirstName();
    String getLastName();
    String getProfileImage();
    String getResearchBackground();
    String getEducationalQualifications();
}
