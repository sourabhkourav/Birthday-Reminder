package com.example.birthday_reminder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter
	@Setter
	@NotBlank(message = "Name is mandatory")
	private String name;
	@Setter
	@Getter
	@Min(value = 1, message = "Day must be at least 1")
	@Max(value = 31, message = "Day must be less than or equal to 31")
	private int day;
	@Setter
	@Getter
	@Min(value = 1, message = "Month must be at least 1")
	@Max(value = 12, message = "Month must be less than or equal to 12")
	private int month;
	
	public Person() {
	}
	
	public Person(String name, int day, int month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
