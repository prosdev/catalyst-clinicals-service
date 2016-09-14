package com.catalystdevworks.repository;

import com.catalystdevworks.entity.PrincipalInvestigator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "investigators", path = "investigators")
interface PrincipalInvestigatorRepository extends JpaRepository<PrincipalInvestigator, Long>{
}
