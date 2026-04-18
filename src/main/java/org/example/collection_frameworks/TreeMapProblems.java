package org.example.collection_frameworks;
import java.util.*;
public class TreeMapProblems {
    public static void main(String[] args) {
        basicProblem();
        bookAuthors();
        wordFrequency();
        studentMap();
    }
    //Q1
    public static void basicProblem(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3,"Animal");
        map.put(2, "Human");
        map.put(6, "Alien");
        System.out.println(map);
    }
    //Q2
    public static void bookAuthors(){
        TreeMap<String, String> map = new TreeMap<>();
        map.put("Money matters","Nikhil");
        map.put("How to make Friends", "Riya");
        map.put("Learn and Earn", "Aditya");
        System.out.println(map);
    }
    //Q3
    public static void wordFrequency(){
        String text = "Nikhil Riya Nikhil Riya Prakanshi Aditya Riya";
        String [] words = text.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
    //Q4
    public static void studentMap() {
        TreeMap<Integer, Student> map = new TreeMap<>();

        map.put(3, new Student(3, "Riya"));
        map.put(1, new Student(1, "Nikhil"));
        map.put(2, new Student(2, "Aditya"));

        System.out.println(map);
    }

}
