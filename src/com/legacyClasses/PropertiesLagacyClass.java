package com.legacyClasses;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesLagacyClass {

    public static void main(String[] args) {

        // Properties class belongs to java.util package.
        // It is used to store data in key-value pair format.
        // It extends Hashtable<Object, Object>.
        // Mostly used for configuration data.

        Properties p = new Properties();   // Creating Properties object

        // setProperty(String key, String value)
        // Used to store data in key-value form.
        // Both key and value must be of type String.

        p.setProperty("Name", "Ramjan");
        p.setProperty("Pass", "Ramjan123");
        p.setProperty("Email", "ramjangori333@gmail");

        // keys() method returns all keys present in the Properties object.
        // Return type is Enumeration<Object>.
        // Enumeration is a legacy interface (used before Iterator).

        Enumeration e = p.keys();

        // hasMoreElements() checks whether more elements are available.
        // nextElement() returns the next key as an Object.

        while (e.hasMoreElements()) {

            // nextElement() returns Object type.
            // So we must typecast it to String.
            String key = (String) e.nextElement();

            // getProperty(String key) returns the value associated with the key.
            // Return type is String.
            System.out.println(key + " " + p.getProperty(key));
        }

        // elements() method returns only values.
        // stringPropertyNames() is a modern and type-safe alternative.
    }
}
