package com.tutorial.springRest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = "vote_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
