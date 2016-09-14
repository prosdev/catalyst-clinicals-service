package com.catalystdevworks.config;

import com.catalystdevworks.entity.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(ClinicalTrial.class);
        config.exposeIdsFor(ClinicalTrialType.class);
        config.exposeIdsFor(ClinicalTrialPhase.class);
        config.exposeIdsFor(PrincipalInvestigator.class);
        config.exposeIdsFor(Sponsor.class);
        config.exposeIdsFor(Tag.class);
        config.exposeIdsFor(TargetGroupAttribute.class);
    }
}
