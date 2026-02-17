package com.enumeration.cursor;
import java.util.Enumeration;
import java.util.Vector;

// Enumeration cursor used to iterate legacy class objects 
public class EnumerationExample {
  public static void main(String[] args) {
	  Vector v = new Vector();
	    v.add(49);
	    v.add(30);
	    v.add(34);
	    v.add(88);
	    
	    Enumeration  itr = v.elements();
	    while(itr.hasMoreElements()) {
	    	System.out.println(itr.nextElement());
	    }
	    
}
}
