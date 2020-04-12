package org.lemon.springwebbasic.model.skill;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private long id;

    @Column(name = "skill_words")
    @NotBlank(message = "Skill word mandatory")
    private String skillWords;

    private String client;
    private String practice;
}
