package docker.mysql.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import docker.mysql.spring.entity.Person;
import docker.mysql.spring.service.PersonService;

@RestController
@RequestMapping(value = "/api")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	
	@GetMapping("/persons")
	public List<Person> getAll() {
		
		return personService.findAll();
	}
	
	
	
}
