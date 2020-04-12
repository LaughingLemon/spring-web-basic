package org.lemon.springwebbasic.model.tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TagController {
    private final TagRepository repo;

    @Autowired
    public TagController(TagRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/tags")
    public String tags(Model model) {
        model.addAttribute("tags", repo.findAll());
        return "tags";
    }
}
