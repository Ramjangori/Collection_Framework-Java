package com.collectionFramework;

import java.util.Vector;

/*Vector is a class that:

Implements List interface

Stores elements in a dynamic array (like ArrayList)

Is synchronized (thread-safe)
=====Why Vector exists (history)=====

Vector was introduced in Java 1.0

At that time, thread safety was required

Later, ArrayList was introduced (Java 1.2)

ArrayList is faster, so Vector became less used
 * */
public class VectorExample {
     public static void main(String[] args) {
    	 Vector<Integer> v = new Vector<>();
    	 v.add(7);
    	 v.add(67);
    	System.out.println(v.size());
    	v.clear();
    	System.out.println(v.size());
    	v.remove(1);
    	v.get(0);
	}
}
