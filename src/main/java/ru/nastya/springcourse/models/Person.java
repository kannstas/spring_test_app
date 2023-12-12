package ru.nastya.springcourse.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class Person {

    @NotEmpty(message = "Name should not ne empty")
    @Size(min = 2, max=30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Min(value=0, message = "Age should be greater than 0")
    private int age;
    @NotEmpty(message="Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    public Person() {

    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age=age;
        this.email=email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

