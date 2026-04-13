package com.QueueExample;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 *
 *            QUEUE
 * 
 * 
 * 1) Queue is an Interface present in java.util package.
 * 
 * 2) It extends Collection interface.
 * 
 * 3) Queue follows FIFO principle:
 *    FIFO = First In First Out
 *    The element inserted first will be removed first.
 * 
 * ---------------------------------
 *  Why Queue is Important?
 * ---------------------------------
 * 
 * 4) Queue is used when we need ordered processing.
 * 
 * 
 * 6) Queue provides important methods:
 *      - add() / offer()      -> Insert element
 *      - remove() / poll()    -> Remove element
 *      - element() / peek()   -> View head element
 * 
 * 7) Queue does NOT allow index-based access.
 * 
 * 8) Common Implementations of Queue:
 *      - LinkedList
 *      - PriorityQueue
 *      - ArrayDeque
 * 
 * 9) PriorityQueue does NOT follow pure FIFO.
 *    It works on priority (Min-Heap by default).
 * 
 * 10) Queue improves performance in real-time processing systems
 *     where order of execution matters.
 * 
 */

public class QueueExample {
	 public static void main(String[] args) {
		 Queue q  = new ArrayDeque();
		 q.add(20);
		 q.offer(20);
		 q.add(39);
		 System.out.println(q.peek()); // show head element 
		 System.out.println(q.poll()); // return and remove head element 
		 
	}
	  

}
