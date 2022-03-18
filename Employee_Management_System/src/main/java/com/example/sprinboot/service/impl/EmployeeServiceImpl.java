package com.example.sprinboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sprinboot.entity.Employee;
import com.example.sprinboot.repository.EmployeeRepository;
import com.example.sprinboot.service.EmployeeService;

@Service	
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<Employee> getAllEmployees()
	{
		return employeeRepo.findAll();
	}
	
	@Override	
    public Employee saveEmployee(Employee employee)
    {
	    return employeeRepo.save(employee); 
    }
	
	@Override
	public Employee getEmployeeById(Long id)
	{
		return employeeRepo.findById(id).get();
	}
	
	@Override
	public Employee updateEmployee(Employee employee)
	{
		return employeeRepo.save(employee);
	}
	
	@Override
	public void deleteEmployeeById(Long id)
	{
		employeeRepo.deleteById(id);
	}
}
