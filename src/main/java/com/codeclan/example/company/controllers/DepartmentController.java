package com.codeclan.example.company.controllers;

import com.codeclan.example.company.models.Department;
import com.codeclan.example.company.repositories.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepo departmentRepo;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepo.findAll();
    }
}
