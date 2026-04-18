package org.example.collection_frameworks;
import java.util.*;
public class StackProblems {

    public static void main(String[] args) {
        stackUsingStack();
        stackUsingLinkedList();
        stackUsingArrayDeque();
        stackUsingPriorityQueue();
    }
    //Q1
    public static void stackUsingStack(){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
    //Q2
    public static void stackUsingLinkedList(){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    //Q3
    public static void stackUsingArrayDeque(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    //Q4
    public static void stackUsingPriorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(10);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}