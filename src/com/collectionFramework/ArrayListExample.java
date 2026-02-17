package com.collectionFramework;
import java.util.*;

// ArrayList implements the List interface
// List represents an ordered collection of objects
// Duplicates are allowed in List
// Elements are accessed using index (0, 1, 2, ...)
// We cannot create an object of the List interface directly

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating an ArrayList object of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // add() method is used to add elements to the ArrayList
        list.add(10);
        list.add(30);

        // remove(index) removes the element at the given index
        list.remove(0);

        // Adding another element
        list.add(50);

        // get(index) is used to access an element at a specific index
        System.out.println(list.get(0));

        // size() returns the number of elements in the ArrayList
        System.out.println(list.size());

        // contains() checks whether the element exists in the list
        System.out.println(list.contains(30));

        // add(index, element) inserts an element at a specific index
        list.add(2, 50);
    }
}
