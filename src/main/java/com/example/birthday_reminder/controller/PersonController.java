package com.example.birthday_reminder.controller;

import com.example.birthday_reminder.model.Person;
import com.example.birthday_reminder.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.1.3:3000"})
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/add")
	public Person addPerson(@Valid @RequestBody Person person){
		return personService.savePerson(person);
	}
	
	@GetMapping("/all")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable Long id, @Valid @RequestBody Person personDetails) {
		return personService.updatePerson(id, personDetails);
	}
	
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable Long id) {
		personService.deletePerson(id);
	}
}
