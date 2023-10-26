package docker.mysql.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import docker.mysql.spring.entity.Person;
import docker.mysql.spring.repository.PersonRepository;


@Service
public class PersonService {

	
	@Autowired
	private PersonRepository personRepository;
	
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	
	
}