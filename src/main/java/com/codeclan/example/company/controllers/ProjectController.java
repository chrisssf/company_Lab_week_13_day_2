package com.codeclan.example.company.controllers;

import com.codeclan.example.company.models.Project;
import com.codeclan.example.company.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepo projectRepo;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectRepo.findAll();
    }

}
