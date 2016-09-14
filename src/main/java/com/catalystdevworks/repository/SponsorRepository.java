package com.catalystdevworks.repository;

import com.catalystdevworks.entity.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "sponsors", path = "sponsors")
interface SponsorRepository extends JpaRepository<Sponsor, Long>{
}
