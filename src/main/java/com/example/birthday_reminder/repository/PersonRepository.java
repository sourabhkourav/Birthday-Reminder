package com.example.birthday_reminder.repository;

import com.example.birthday_reminder.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByMonthAndDay(int month, int day);
}
