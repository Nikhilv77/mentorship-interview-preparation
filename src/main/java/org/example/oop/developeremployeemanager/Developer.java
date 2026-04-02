package org.example.oop.developeremployeemanager;

public class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, double baseSalary, String programmingLanguage){
       super(name,baseSalary);
       this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
