package com.example.birthday_reminder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Name is mandatory")
	private String name;
	@Min(value = 1, message = "Day must be at least 1")
	@Max(value = 31, message = "Day must be less than or equal to 31")
	private int day;
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
	
}
