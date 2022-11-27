package com.tutorial.springRest.repository;

import com.tutorial.springRest.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}

