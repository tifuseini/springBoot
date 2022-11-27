package com.tutorial.springRest.repository;

import com.tutorial.springRest.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}

