package com.catalystdevworks.repository;

import com.catalystdevworks.entity.TargetGroupAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "target", path = "target")
interface TargetGroupAttributeRepository extends JpaRepository<TargetGroupAttribute, Long>{
}
