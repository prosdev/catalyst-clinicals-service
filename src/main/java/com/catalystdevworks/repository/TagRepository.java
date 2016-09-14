package com.catalystdevworks.repository;

import com.catalystdevworks.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tags", path = "tags")
interface TagRepository extends JpaRepository<Tag, String> {
}
