package docker.mysql.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import docker.mysql.spring.entity.Employee;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}