package org.example.collection_frameworks;
import java.util.*;

public class ArrayListProblems {
    //Q1
    public static void sortAlphabetically(){
        List<String> list = new ArrayList<>();
        list.add("home");
        list.add("car");
        list.add("school");
        list.add("animal");
        list.add("boxing");
        list.add("zebra");
        Collections.sort(list);
        System.out.println(list);
    }
    //Q2
    public static void findMaximum(){
         List<Integer> list = new ArrayList<>();
         list.add(12);
         list.add(44);
         list.add(88);
         list.add(-33);
         list.add(122);
         int answer = Collections.max(list);
        System.out.println(answer);
    }
    //Q3
    public static void removeDuplicates(){
        List<String> list = new ArrayList<>();
        list.add("Riya");
        list.add("Riya");
        list.add("Nikhil");
        list.add("Nikhil");
        list.add("Nikhil");
        list.add("Prakanshi");
        list.add("Prakanshi");
        list.add("Prakanshi");
        list.add("Anjali");
        list.add("Arjun");
        list.add("Raj");
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);
    }
    //Q4
    public static void linkedListOperations(){
         LinkedList<Integer> list = new LinkedList<>();
         list.add(20);
         list.remove(0);
         list.add(22);
         list.add(33);
         list.add(44);
         list.add(55);
         list.remove(1);
         System.out.println(list);
         list.addFirst(66);
         list.addLast(77);
         list.addFirst(88);
         list.removeFirst();
         System.out.println(list);
         for(int val : list){
             System.out.print(val + " ");
         }
        System.out.println();
    }
    //Q5
    public static void findIntersectionOfTwoLists(){
         ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();
         list1.add(12);
         list1.add(13);
         list1.add(14);
         list1.add(15);
         list1.add(16);

         list2.add(15);
         list2.add(16);
         list2.add(17);
         list2.add(18);

         list1.retainAll(list2);
        System.out.println(list1);

    }
    //Q6
    public static void shuffleList(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);

        Collections.shuffle(list1);
        System.out.println(list1);

    }
    //Q7
    public static void secondLargest(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(-1);
        list.add(88);
        list.add(120);
        list.add(98);
        Collections.sort(list);
        System.out.println(list.get(list.size() - 2));
    }
    //Q8
    public static void findFrequency(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(-1);
        list.add(88);
        list.add(120);
        list.add(98);
        list.add(98);
        list.add(12);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : list){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        System.out.println(map);
    }
    //Q9
    public static void kThSmallest(){
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(-1);
        list.add(88);
        list.add(120);
        list.add(98);
        list.add(98);
        list.add(12);
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
    //Q10
    public static void addTwoLists(){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);

        list2.add(15);
        list2.add(16);
        list2.add(17);
        list2.add(18);

        list1.addAll(list2);
        System.out.println(list1);
    }
    //Q11
    public static void interSectionOfMultipleSets(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set1.add(12);
        set1.add(13);
        set1.add(14);
        set1.add(15);
        set1.add(16);

        set2.add(15);
        set2.add(16);
        set2.add(17);
        set2.add(18);

        set3.add(15);
        set3.add(18);
        set3.add(19);
        set3.add(20);
        set1.retainAll(set2);
        set1.retainAll(set3);
        System.out.println(set1);
    }
    //Q12
    public static void equalLinkedLists(){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(11);
        list1.add(13);
        list2.add(11);
        list2.add(13);
        System.out.println(list1.equals(list2));
    }
    //Q13
    public static void subset(){
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
        sortAlphabetically();
        findMaximum();
        removeDuplicates();
        linkedListOperations();
        findIntersectionOfTwoLists();
        shuffleList();
        secondLargest();
        findFrequency();
        kThSmallest();
        addTwoLists();
        interSectionOfMultipleSets();
        equalLinkedLists();
        subset();
    }

}
