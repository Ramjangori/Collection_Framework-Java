package MapInterface;

import java.util.HashMap;
import java.util.Map;

/*
 * Map interface is present in java.util package
 * It stores data in key-value pairs
 * Introduced in JDK 1.2
 *
 * Keys must be unique (duplicate keys not allowed)
 * Values can be duplicate
 *
 * Null key and null values depend on implementation:
 * - HashMap allows one null key and multiple null values
 * - TreeMap does NOT allow null key
 * - Hashtable does NOT allow null key or null value
 *
 * Map does NOT extend Collection interface
 * Insertion order depends on implementation class
 */
public class MapInterface {
     Map m = new HashMap();
}