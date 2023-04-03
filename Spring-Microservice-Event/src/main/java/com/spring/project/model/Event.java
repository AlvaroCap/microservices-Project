package com.spring.project.model;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String shortDesc;
	String longDesc;
	Date date;
	LocalDateTime schedule;
	double price;
	String rules;
	String siteName;
	String siteCity;
	String siteAddress;
	String siteType;
	int capacity;
	String genre;
	
}
