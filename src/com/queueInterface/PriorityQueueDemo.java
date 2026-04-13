package com.queueInterface;

import java.util.PriorityQueue;

/*
 * PriorityQueue implements Queue interface
 * It does NOT implement Deque
 * Does NOT guarantee insertion order
 * Internal Data Structure: Binary Heap (Min-Heap by default)
 * Does NOT allow null elements
 * Elements are ordered based on their priority (natural ordering or Comparator)
 */

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(40);
        q.add(20);
        q.add(45);
        q.add(25);
        q.add(40);
        q.add(20);
        

        System.out.println(q);
    }
}