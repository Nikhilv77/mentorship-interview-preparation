package org.example.collection_frameworks;

import java.util.*;

public class PriorityQueueProblems {

    public static void main(String[] args) {
        basicPriorityQueue();
        usingPriorityQueueClass();
        usingCustomComparator();
        usingCustomComparatorDuplicate();
        queueUsingPQWithComparator();
        stackUsingPQWithComparator();
    }

    // Q1
    public static void basicPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 10 20 30
        }
    }

    // Q2
    public static void usingPriorityQueueClass() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(1);
        pq.offer(3);

        System.out.println(pq.poll()); // 1
        System.out.println(pq.peek()); // 3
    }

    // Q3
    public static void usingCustomComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println(pq.poll()); // 30
        System.out.println(pq.peek()); // 20
    }

    // Q4: Same as Q3
    public static void usingCustomComparatorDuplicate() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(100);
        pq.offer(50);
        pq.offer(70);

        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }

    // Q5
    public static void queueUsingPQWithComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(5);
        pq.offer(15);
        pq.offer(10);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 15 10 5
        }
    }

    // Q6
    public static void stackUsingPQWithComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq.poll()); // 30
        System.out.println(pq.peek()); // 20
    }
}