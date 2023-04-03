package com.spring.project.DTO;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

public class EventDTO implements Serializable{
	
	String name;
	String shortDesc;
	String longDesc;
	Date date; 
	LocalDateTime schedule;
	double price;
	String siteName;
	String siteCity;
	int capacity;
	String genre;
	
	
	
	public EventDTO(Long id, String name, String shortDesc, String longDesc, Date date, LocalDateTime schedule,
			double price, String siteName, String siteCity, int capacity, String genre) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.date = date;
		this.schedule = schedule;
		this.price = price;
		this.siteName = siteName;
		this.siteCity = siteCity;
		this.capacity = capacity;
		this.genre = genre;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalDateTime getSchedule() {
		return schedule;
	}
	public void setSchedule(LocalDateTime schedule) {
		this.schedule = schedule;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteCity() {
		return siteCity;
	}
	public void setSiteCity(String siteCity) {
		this.siteCity = siteCity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}