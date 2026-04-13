package MapInterface;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is a class that implements Map interface
 * Introduced in JDK 1.2
 * Stores data in key-value pairs
 * Keys must be unique
 * Values can be duplicate
 * Allows one null key and multiple null values
 * Does NOT maintain insertion order
 *
 * Internal Data Structure:
 * Array of buckets + LinkedList (Java 7)
 * Array + LinkedList / Red-Black Tree (Java 8+ when collisions > 8)
 */

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> h = new HashMap<>();

        h.put(101, "Ramjan");
        h.put(102, "Aman");
        h.put(103, "Idrish");
        h.put(104, "Sameer");

        System.out.println(h);

        // Method 1: Using entrySet()
        for(Map.Entry<Integer, String> e : h.entrySet()) {
        	System.out.println(e.getKey() + " -> "+ e.getValue());
        }
        
        //  method 2 
        for(Integer i : h.keySet()) {
        	System.out.println(i + "->" + h.get(i));
        }
    }
}