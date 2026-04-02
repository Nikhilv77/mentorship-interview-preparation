package org.example.oop.developeremployeemanager;

public class Main {
    public static void main(String[] args){
        Developer developer = new Developer("Nikhil", 1200000, "Javascript");
        Manager manager = new Manager("Raghu", 3000000, 15);
        developer.displayInfo();
        System.out.println();
        manager.displayInfo();
    }
}
