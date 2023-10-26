package docker.mysql.spring.service;

import java.util.List;

import docker.mysql.spring.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}