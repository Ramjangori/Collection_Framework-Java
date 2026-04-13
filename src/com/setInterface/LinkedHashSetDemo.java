package com.setInterface;

import java.util.LinkedHashSet;

// LinkedHashSet is a subclass of HashSet
// It maintains insertion order
// It internally uses a HashMap (specifically LinkedHashMap)
// Data structure: Hash table + Doubly Linked List
// Doubly Linked List is used to maintain insertion order

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // Creating LinkedHashSet object
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Elements will print in insertion order
        System.out.println(set);
    }
}