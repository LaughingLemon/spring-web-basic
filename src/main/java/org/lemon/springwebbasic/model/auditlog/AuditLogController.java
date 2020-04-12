package org.lemon.springwebbasic.model.auditlog;

import org.lemon.springwebbasic.model.auditlog.AuditLogRepository;
import org.lemon.springwebbasic.model.skill.SkillRepository;
import org.lemon.springwebbasic.model.tag.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuditLogController {
    private final AuditLogRepository auditLogRepo;
    private final SkillRepository skillRepo;
    private final TagRepository tagRepo;

    @Autowired
    public AuditLogController(AuditLogRepository auditLogRepo,
                              SkillRepository skillRepo,
                              TagRepository tagRepo) {
        this.auditLogRepo = auditLogRepo;
        this.skillRepo = skillRepo;
        this.tagRepo = tagRepo;
    }

    @GetMapping("/audit-logs")
    public String auditLogs(Model model) {
        model.addAttribute("auditlogs", auditLogRepo.findAll());
        return "audit-logs";
    }
}
