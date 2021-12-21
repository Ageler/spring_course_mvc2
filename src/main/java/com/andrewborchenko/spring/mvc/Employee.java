package com.andrewborchenko.spring.mvc;

import com.andrewborchenko.spring.mvc.validation.CheckEmail;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Data
public class Employee {
    @Size(min = 6, max = 15, message = "name must be between 6 and 15 symbols")
    private String name;
    //Проверка что поле не из одних пробелов
    @NotBlank(message = "this field is required")
    private String surname;
    @Min(value = 1, message = "salary must be more than zero")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Please use this pattern XXX-XXX-XXXX")
    private String phoneNumber;
    @CheckEmail
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology" );
        departments.put("BIO", "Biology" );
        departments.put("Math", "Mathematics" );

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Kia", "Kia");

        languages = new String[3];
        languages[0] = "English";
        languages[1] = "French";
        languages[2] = "Spanish";
    }
/*
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }*/
}
