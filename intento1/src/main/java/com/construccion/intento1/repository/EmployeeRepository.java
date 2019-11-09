package com.construccion.intento1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.construccion.intento1.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}