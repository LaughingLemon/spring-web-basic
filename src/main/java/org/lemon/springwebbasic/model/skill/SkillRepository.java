package org.lemon.springwebbasic.model.skill;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "skills", path = "skills")
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
