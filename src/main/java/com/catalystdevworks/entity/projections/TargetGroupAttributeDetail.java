package com.catalystdevworks.entity.projections;

import com.catalystdevworks.entity.Sponsor;
import com.catalystdevworks.entity.TargetGroupAttribute;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineTargetGroupAttributeDetail", types = {TargetGroupAttribute.class})
interface TargetGroupAttributeDetail {
    String getId();
    String getName();
    int getMinAge();
    int getMaxAge();
    String getTargetGroupDescription();
}
