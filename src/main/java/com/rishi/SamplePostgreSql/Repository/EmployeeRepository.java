package com.rishi.SamplePostgreSql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.SamplePostgreSql.Model.Employee;


//import com.example.demoApp.repository.EmployeeRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
@Repository


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}