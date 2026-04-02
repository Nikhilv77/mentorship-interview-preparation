package org.example.oop.developeremployeemanager;

public class Employee {
    String name;
    double baseSalary;
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
