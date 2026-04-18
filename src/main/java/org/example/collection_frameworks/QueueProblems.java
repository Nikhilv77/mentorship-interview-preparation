package org.example.collection_frameworks;
import java.util.*;

public class QueueProblems {

    public static void main(String[] args) {
        usingLinkedList();
        priorityQueueWithComparator();
        usingPriorityQueue();
        usingArrayDeque();
        queueUsingPQWithComparator();
    }

    // Q1
    public static void usingLinkedList() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll()); // 10
        System.out.println(queue.peek()); // 20
    }

    // Q2
    public static void priorityQueueWithComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll()); // 30
        System.out.println(pq.peek()); // 20
    }

    // Q3
    public static void usingPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll()); // 10
        System.out.println(pq.peek()); // 20
    }

    // Q4
    public static void usingArrayDeque() {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.poll()); // 10
        System.out.println(queue.peek()); // 20
    }

    // Q5
    public static void queueUsingPQWithComparator() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(5);
        pq.offer(15);
        pq.offer(10);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}