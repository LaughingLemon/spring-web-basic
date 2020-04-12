package org.lemon.springwebbasic.model.tag;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private long id;

    @Column(name = "tag_words")
    @NotBlank(message = "Tag word mandatory")
    private String tagWords;

    private String client;
    private String practice;
}
