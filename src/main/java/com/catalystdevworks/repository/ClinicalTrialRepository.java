package com.catalystdevworks.repository;

import com.catalystdevworks.entity.ClinicalTrial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trials", path = "trials")
interface ClinicalTrialRepository extends JpaRepository<ClinicalTrial, String>{
}
