package com.collectionFrameworkSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Set => is an interface extends collection interface 
/*❌ Does NOT allow duplicate elements

❌ Does NOT follow index (no 0,1,2…)

✔️ Stores unique values only

📌 Example (real life):
A list of roll numbers – one roll number cannot come twice.
Collection (interface)
   |
   └── Set (interface)
         |
         ├── HashSet
         ├── LinkedHashSet
         |-SortedSet (Interface)
              |-TreeSet

*/
public class Demo1 {
      public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>(); // implements Set interface
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(); // implements Set interface
		TreeSet<Integer> Tree = new TreeSet<>(); // implements SortedTree interface
		hashset.add(3);
		linkedHashSet.add(89);
		Tree.add(56);
		
		hashset.add(67);
		hashset.add(60);
		hashset.add(60); // not store duplicate 
		hashset.add(56);

		hashset.add(99);

//		System.out.println(hashset); // print in different order not follow insertion order
		
		// iteration 
//		 Iterator itr = hashset.iterator();
		
		 while(hashset.iterator().hasNext()) {
			 System.out.println(hashset.iterator().next());
		 }
		
		
	}
}
