package com.project.spring.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.project.spring.dto.UserDTO;
import com.project.spring.model.User;

@Component
public class UserMapper {

	public UserDTO convertToDto(User user) {
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setLastName(user.getLastName());
		dto.setMail(user.getMail());
		return dto;

	}

	public List<UserDTO> convertToDto(List<User> users) {
		return users.stream().map(p -> convertToDto(p)).collect(Collectors.toList());
	}

}
