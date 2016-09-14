package com.catalystdevworks.repository;

import com.catalystdevworks.entity.ClinicalTrialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "types", path = "types")
interface ClinicalTrialTypeRepository extends JpaRepository<ClinicalTrialType, String>{
}
