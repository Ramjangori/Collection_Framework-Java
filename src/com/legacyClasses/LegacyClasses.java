package com.legacyClasses;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Legacy Classes:
 * --------------
 * Legacy classes were introduced in JDK 1.0.
 * They are synchronized by default.
 * Mostly used in older applications.
 * 
 * Examples of Legacy Classes:
 * 1. Vector
 * 2. Stack
 * 3. Dictionary
 * 4. Hashtable
 * 5. Properties
 * 
 * They can store heterogeneous data (different types of objects).
 */

public class LegacyClasses {

    public static void main(String[] args) {
        
        // Creating a Vector object (Legacy class)
        Vector v = new Vector(); 
        
        // Adding different types of elements (Heterogeneous data)
        v.addElement(10);              // Integer
        v.addElement("Ramjan");        // String
        v.add(4.3);                    // Double
        v.add(new String("Hello"));    // String Object
        
        // Printing the entire Vector
        System.out.println(v);
        
        // Enumeration is used in legacy classes to iterate elements
        Enumeration em = v.elements();
        
        // Traversing elements one by one
        while(em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
    }
}
