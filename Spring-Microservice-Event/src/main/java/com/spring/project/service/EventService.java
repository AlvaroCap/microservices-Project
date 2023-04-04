package com.spring.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.dto.EventDTO;
import com.spring.project.model.Event;
import com.spring.project.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<EventDTO> findAll(){
		
		return eventRepository.findAll();
	}

}