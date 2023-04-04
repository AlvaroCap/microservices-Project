package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.dto.EventDTO;
import com.spring.project.model.Event;

@Repository
public interface EventRepository extends JpaRepository<EventDTO, Long> {
}


