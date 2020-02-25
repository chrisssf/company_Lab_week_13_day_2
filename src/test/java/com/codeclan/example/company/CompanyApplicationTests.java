package com.codeclan.example.company;

import com.codeclan.example.company.models.Department;
import com.codeclan.example.company.models.Employee;
import com.codeclan.example.company.models.Project;
import com.codeclan.example.company.repositories.DepartmentRepo;
import com.codeclan.example.company.repositories.EmployeeRepo;
import com.codeclan.example.company.repositories.ProjectRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DepartmentRepo departmentRepo;

	@Autowired
	ProjectRepo projectRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndSave(){
		Department department = new Department("IT");
		departmentRepo.save(department);

		Employee employee = new Employee("Steve", "Jobs", 123, department);
		employeeRepo.save(employee);

		Project project = new Project("Codeclan", "16 weeks");
		projectRepo.save(project);

		project.addEmployee(employee);
		projectRepo.save(project);

	}

//	@Test
//	public void addEmployeeToProject(){
//		Department department = new Department("IT");
//		Employee employee = new Employee("Bob", "Jobs", 123, department);
//		Project project = new Project("Snooker", "1 weeks");
//
//	}




}
