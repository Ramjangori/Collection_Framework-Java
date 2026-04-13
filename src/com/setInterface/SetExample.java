package com.setInterface;

import java.util.*;

// Set interface stores a collection of UNIQUE elements
// Set is NOT index-based
// HashSet does NOT maintain insertion order
// HashSet allows only ONE null value
// HashSet internally uses HashMap
// Classes that implement Set interface:
// HashSet, LinkedHashSet, TreeSet

public class SetExample {
    public static void main(String[] args) {

        // Using HashSet implementation of Set
        HashSet set = new HashSet();

        set.add(29);
        set.add(30);
        set.add(40);
        set.add(30);   // Duplicate, will not be added

        System.out.println(set);

        Iterator it = set.iterator();

        // We cannot access elements using index
        // Because Set does not support index-based access

//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

//        for(Object i : set) {
//            System.out.println(i);
//        }

        set.remove(30);
        System.out.println(set);

        System.out.println("Size: " + set.size());
    }
}