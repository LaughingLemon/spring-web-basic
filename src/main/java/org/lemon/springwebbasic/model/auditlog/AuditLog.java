package org.lemon.springwebbasic.model.auditlog;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "audit_log")
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "audit_log_id")
    private long id;

    @Column(name = "tag_skill")
    @NotBlank(message = "Tag or Skill word mandatory")
    private String tagOrSkill;

    private String client;
    private String practice;

    private LocalDateTime created;
}
