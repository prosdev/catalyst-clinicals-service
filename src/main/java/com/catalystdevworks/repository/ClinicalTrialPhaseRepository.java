package com.catalystdevworks.repository;

import com.catalystdevworks.entity.ClinicalTrialPhase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "phases", path = "phases")
interface ClinicalTrialPhaseRepository extends JpaRepository<ClinicalTrialPhase, String>{
}
