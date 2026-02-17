package com.collectionFramework;

import java.util.LinkedList;

/*
 * LinkedList:
 * -----------
 * - Implements the List interface
 * - Elements are stored as nodes
 * - Each node contains:
 *      1) Data
 *      2) Reference (link) to the next node
 * - Elements are NOT stored in continuous memory
 * - Insertion and deletion are faster compared to ArrayList
 */

public class LinkedListExample {
    public static void main(String[] args) {

        // Creating a LinkedList object
        LinkedList<Integer> list = new LinkedList<>();

        // add() method adds elements to the LinkedList
        list.add(30);
        list.add(40);

        // Printing the LinkedList
        System.out.println(list);   // [30, 40]

        // remove(index) removes and returns the element at given index
        System.out.println(list.remove(0)); // removes 30

        // size() returns the number of elements in the LinkedList
        System.out.println(list.size());

        // get(index) returns the element at the given index
        System.out.println(list.get(0)); // 40
    }
}
