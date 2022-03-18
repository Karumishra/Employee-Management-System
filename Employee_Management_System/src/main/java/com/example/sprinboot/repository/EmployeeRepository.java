package com.example.sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprinboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
