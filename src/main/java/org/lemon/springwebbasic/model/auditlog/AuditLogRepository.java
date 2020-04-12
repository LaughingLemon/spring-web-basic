package org.lemon.springwebbasic.model.auditlog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "audit-log", path = "audit-log")
public interface AuditLogRepository extends CrudRepository<AuditLog, Integer> {
}
