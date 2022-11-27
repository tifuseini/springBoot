package com.tutorial.springRest.repository;

import com.tutorial.springRest.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
}

