package com.example.sprinboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sprinboot.entity.Employee;
import com.example.sprinboot.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
    @Override
    public void run(String ...args) throws Exception
    {
    	Employee emp1=new Employee("Karunakar","Mishra","karunakar@gmail.com");
    	employeeRepository.save(emp1);
    	Employee emp2=new Employee("Naveen","Arora","naveen@gmail.com");
    	employeeRepository.save(emp2);
    	Employee emp3=new Employee("Shreya","Goyal","shreya@gmail.com");
    	employeeRepository.save(emp3);
    	
    }
}
