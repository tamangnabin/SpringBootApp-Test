package com.SpringbootApp.demo.Entity;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int employeeNumber;

// All agrs constructor
    public Employee(String firstName, String lastName, int age, int employeeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
