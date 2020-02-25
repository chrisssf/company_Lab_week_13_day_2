package com.codeclan.example.company.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private int employee_number;

    @Column
    private ArrayList<Project> projects;

    public Employee(String first_name, String last_name, int employee_number, ArrayList<Project> projects){
        this.first_name = first_name;
        this.last_name = last_name;
        this.employee_number = employee_number;
        this.projects = projects;
    }

}
