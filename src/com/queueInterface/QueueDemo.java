package com.queueInterface;

// Queue is an interface which extends Collection interface
// Queue follows FIFO (First In First Out) principle
// The element inserted first will be removed first
// Most Queue implementations maintain insertion order (like ArrayDeque, LinkedList)
// Queue implementations are NOT thread-safe by default
// Deque interface extends Queue to support double-ended queue operations
// Elements can be added/removed from both front and rear
// Classes that implement Deque: ArrayDeque, LinkedList

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
       // ArrayDeque -> maintain Insertion Order 
       // Operation can perfrom both side  front side 
       // Null not allowed 
        Deque q = new ArrayDeque<>();

        q.add(20);
        q.add(30);
        q.add(50);
        q.add(10);
        q.add(null);
       

        System.out.println(q.poll()); // returns and removes head element (20)
        System.out.println(q.peek()); // returns head element (30) but does NOT remove it
    }
}