package com.catalystdevworks.entity.projections;

import org.aspectj.apache.bcel.generic.Tag;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineTagDetail", types = {Tag.class})
interface TagDetail {
    String getId();
    String getName();
}
