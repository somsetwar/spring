package com.test.training;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.cognizant.training.boot.springbootwithrestrepository.model.Employee;

@Repository
@RepositoryRestResource(path="emp",collectionResourceRel="entries")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
