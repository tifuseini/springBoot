package com.tutorial.springRest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Poll {

    @Id
    @GeneratedValue
    @Column(name = "poll_id")
    private Long id;

    @Column(name = "poll_question")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "poll_id")
    @OrderBy
    private Set<Option> options;
}
