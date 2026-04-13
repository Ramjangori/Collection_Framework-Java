package com.setInterface;

import java.util.TreeSet;

/*
 * TreeSet implements NavigableSet
 * NavigableSet extends SortedSet
 * SortedSet extends Set
 *
 * Duplicates are NOT allowed
 * Maintains sorted (ascending) order by default
 *
 * Internal Data Structure: Self-balancing binary search tree (Red-Black Tree)
 * Elements are retrieved using In-order traversal (Left → Root → Right)
 *
 * Null is NOT allowed (because elements must be comparable)
 * Only homogeneous elements are allowed (must be mutually comparable)
 *
 */

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

        t.add(20);
        t.add(40);
        t.add(10);
        t.add(50);
        t.add(5);
        t.add(3);

        System.out.println(t); // [3, 5, 10, 20, 40, 50]

        // Special methods of TreeSet (from NavigableSet)

        System.out.println(t.ceiling(35)); // returns smallest element >= 35 (here 40)
        System.out.println(t.floor(35));   // returns greatest element <= 35 (here 20)
        System.out.println(t.lower(20));   // strictly less than 20 (10)
        System.out.println(t.higher(20));  // strictly greater than 20 (40)

        System.out.println(t.first());     // smallest element
        System.out.println(t.last());      // largest element

        System.out.println(t.tailSet(20)); // elements >= 20
        System.out.println(t.headSet(30)); // elements < 30
    }
}