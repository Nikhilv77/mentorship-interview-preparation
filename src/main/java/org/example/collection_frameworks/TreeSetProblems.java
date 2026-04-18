package org.example.collection_frameworks;
import java.util.Arrays;
import java.util.TreeSet;

   class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    public String toString(){
        return id + " -> " + name;
    }
}
public class TreeSetProblems {
    //Q1
    public static void addElements() {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 90, 101, 33, 99, 292));
        System.out.println(set);
    }
    //Q2
    public static void sortElements(){
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(3,"Riya"));
        set.add(new Student(1, "Nikhil"));
        set.add(new Student(2, "Aditya"));
        System.out.println(set);
    }

    public static void main(String[] args) {
        addElements();
        sortElements();
    }
}

