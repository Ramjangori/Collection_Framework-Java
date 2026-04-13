package com.legacyClasses;

import java.util.Enumeration;
import java.util.Properties;

public class Properties2 {
   public static void main(String[] args) {
	Properties s = new Properties();
	s.setProperty("Name", "Ramjan");
	s.setProperty("Pass","Ramjan123");
	s.setProperty("Email","ramjan666@gmail.com");
	System.out.println(s);
	
//	Enumeration e = s.propertyNames();
//	 
//	while(e.hasMoreElements()) {
//		
//		String key = (String) e.nextElement();
//		System.out.println(s.getProperty(key));
//	}
	
	
}
}
