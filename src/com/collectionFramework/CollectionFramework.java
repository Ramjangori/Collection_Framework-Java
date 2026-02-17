package com.collectionFramework;

/*
 * Collection Framework:
 * ---------------------
 * Collection Framework is a set of interfaces and classes
 * used to store, manipulate, and process a group of objects dynamically.
 * 
 *
 * It uses:
 * - Wrapper Classes (because collections store objects)
 * - Generics (for type safety)
 *
 * Collection Framework Hierarchy:
 *
 * Iterable
 *    |
 * Collection   (interface)
 *    |
 *    |---- List   (interface) 
 *    |        | -> ordered, duplicates allowed
 *    |        |---- ArrayList
 *    |        |---- LinkedList
 *    |        |---- Vector
 *    |
 *    |---- Set    (interface)  -> no duplicates
 *    |        |---- HashSet
 *    |        |---- LinkedHashSet
 *    |        |---- TreeSet
 *    |
 *    |---- Queue  (interface)  -> FIFO
 *             |---- PriorityQueue
 *             |---- ArrayDeque
 */

public class CollectionFramework {
    public static void main(String[] args) {

        // Using List interface with ArrayList class
        java.util.List<Integer> list = new java.util.ArrayList<>();

        list.add(10);   // autoboxing (int -> Integer)
        list.add(20);
        list.add(10);   // duplicate allowed

        System.out.println(list); // output: [10, 20, 10]
    }
}
