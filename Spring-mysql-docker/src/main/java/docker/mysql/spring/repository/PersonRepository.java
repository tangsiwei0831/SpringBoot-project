package docker.mysql.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import docker.mysql.spring.entity.Person;



@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
