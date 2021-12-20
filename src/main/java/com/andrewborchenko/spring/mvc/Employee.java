package com.andrewborchenko.spring.mvc;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
}
