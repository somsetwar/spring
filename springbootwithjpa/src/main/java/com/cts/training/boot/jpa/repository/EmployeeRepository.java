package com.cts.training.boot.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.training.boot.jpa.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("select e from Employee e where designation=?1")
	public List<Employee> findEmployeeByDesignation(String designation);
}
