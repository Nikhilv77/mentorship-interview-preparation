package org.example.collection_frameworks;

import java.util.*;

public class HashMapProblems {

    // Q1
    public static void countryCapital() {
        Map<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        System.out.println(map);
    }

    // Q2
    public static void employeeNames() {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Nikhil");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        System.out.println(map);
    }

    // Q3
    public static void cityPopulation() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Mumbai", 20000000);
        map.put("Delhi", 18000000);
        map.put("Bangalore", 12000000);

        System.out.println(map);
    }

    // Q4
    public static void productPrice() {
        Map<String, Double> map = new HashMap<>();

        map.put("Laptop", 75000.50);
        map.put("Phone", 30000.75);
        map.put("Headphones", 2500.00);

        System.out.println(map);
    }

    // Q5
    public static void employeeDepartment() {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Engineering");
        map.put(102, "HR");
        map.put(103, "Finance");

        System.out.println(map);
    }

        public static void main(String[] args) {
        countryCapital();
        employeeNames();
        cityPopulation();
        productPrice();
        employeeDepartment();
    }
}