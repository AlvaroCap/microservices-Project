package com.spring.project.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.spring.project.dto.EventDTO;
import com.spring.project.model.Event;

@Component
public class EventMapper {

	public EventDTO convertToDto(Event event) {
		EventDTO dto = new EventDTO();
		// productDTO.setId(event.getId());
		dto.setName(event.getName());
		dto.setShortDesc(event.getShortDesc());
		dto.setLongDesc(event.getLongDesc());
		dto.setDate(event.getDate());
		dto.setSchedule(event.getSchedule());
		dto.setPrice(event.getPrice());
		dto.setSiteName(event.getSiteName());
		dto.setSiteCity(event.getSiteCity());
		dto.setCapacity(event.getCapacity());
		dto.setCapacity(event.getCapacity());

		return dto;

	}

	public List<EventDTO> convertToDto(List<Event> products) {
		return products.stream().map(p -> convertToDto(p)).collect(Collectors.toList());
	}
}
