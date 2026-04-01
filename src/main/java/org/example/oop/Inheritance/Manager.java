package org.example.oop.Inheritance;

public class Manager extends Employee{
    int teamSize;
    public Manager(String name, double baseSalary, int teamSize){
        super(name, baseSalary);
        this.teamSize = teamSize;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
