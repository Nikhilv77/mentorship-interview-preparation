package org.example.collection_frameworks;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class LinkedListProblems {
    public static void main(String[] args) {
       basicOperations();
       queueUsingLinkedList();
       stackUsingLinkedList();
       equalLinkedLists();
    }
    //Q1
    public static void basicOperations() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(20));

        for (int val : list) {
            System.out.println(val);
        }
    }
    //Q2
    public static void queueUsingLinkedList(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(40);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
    //Q3
    public static void stackUsingLinkedList(){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    //Q4
    public static void equalLinkedLists(){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(l1.equals(l2));
    }
}
