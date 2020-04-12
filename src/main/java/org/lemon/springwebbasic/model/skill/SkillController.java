package org.lemon.springwebbasic.model.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkillController {
    private final SkillRepository repo;

    @Autowired
    public SkillController(SkillRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/skills")
    public String skills(Model model) {
        model.addAttribute("skills", repo.findAll());
        return "skills";
    }
}
