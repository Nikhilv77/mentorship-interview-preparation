package org.example.collection_frameworks;

import java.util.*;

public class HashSetProblems {

    // Q1
    public static void createAndPrint() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate

        System.out.println(set);

        for (int val : set) {
            System.out.println(val);
        }
    }

    // Q2
    public static void checkElement() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);

        System.out.println(set.contains(10)); // true
        System.out.println(set.contains(99)); // false
    }

    // Q3
    public static void countryCapitalMap() {
        Map<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    // Q4
    public static void commonElements() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        list1.retainAll(list2);

        System.out.println(list1);
    }

    // Q5
    public static void wordFrequency() {
        String sentence = "lion tiger lion tiger tiger tiger elephant cat dog";
        String[] words = sentence.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        System.out.println(map);
    }

    // Q6
    public static void subset() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(11);
        set1.add(12);
        set1.add(13);

        set2.add(11);
        set2.add(12);
        set2.add(19);
        set2.add(14);
        set2.add(15);

        System.out.println(set2.containsAll(set1));
    }

     public static void main(String[] args) {
        createAndPrint();
        checkElement();
        countryCapitalMap();
        commonElements();
        wordFrequency();
        subset();
    }
}