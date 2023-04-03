package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}

