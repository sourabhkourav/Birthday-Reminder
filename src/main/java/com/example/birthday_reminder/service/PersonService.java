package com.example.birthday_reminder.service;

import com.example.birthday_reminder.model.Person;
import com.example.birthday_reminder.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person savePerson(Person person){
		return personRepository.save(person);
	}
	
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}
	
	// Update an existing person
	public Person updatePerson(Long id, Person personDetails) {
		// Find the person by ID
		Optional<Person> personOptional = personRepository.findById(id);
		
		if (!personOptional.isPresent()) {
			throw new RuntimeException("Person not found with id: " + id);
		}
		
		Person person = personOptional.get();
		person.setName(personDetails.getName());
		person.setDay(personDetails.getDay());
		person.setMonth(personDetails.getMonth());
		
		return personRepository.save(person);
	}
	
	public void deletePerson(Long id) {
		Optional<Person> personOptional = personRepository.findById(id);
		
		if (!personOptional.isPresent()) {
			throw new RuntimeException("Person not found with id: " + id);
		}
		
		personRepository.deleteById(id);
	}
}
