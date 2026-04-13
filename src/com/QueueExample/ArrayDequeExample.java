package com.QueueExample;

import java.util.ArrayDeque;

/*
 * 
 *        ArrayDeque Notes
 * 
 *
 * 1) ArrayDeque is a class present in java.util package.
 *
 * 2) It implements the Deque interface.
 *
 * 3) Deque means Double Ended Queue.
 *    So we can insert and remove elements from both sides.
 *
 * 4) ArrayDeque is faster than LinkedList in most cases
 *    because it uses a resizable array internally.
 *
 * 5) It does not allow null values.
 *
 * 6) It can work as:
 *      - Queue (FIFO)
 *      - Stack (LIFO)
 *
 * 7) Common methods:
 *      add()        -> add element at the end
 *      offer()      -> add element at the end
 *      offerFirst() -> add element at the front
 *      offerLast()  -> add element at the end
 *      poll()       -> remove from front
 *      pollLast()   -> remove from end
 *
 */

public class ArrayDequeExample {
  public static void main(String[] args) {
      
      // Creating ArrayDeque object
      ArrayDeque ad = new ArrayDeque();
      
      // add() inserts element at the end
      ad.add(10);
      
      // offer() also inserts at the end
      ad.offer(20);
      
      // offerFirst() inserts element at the beginning
      ad.offerFirst(30);
      
      // printing current deque
      System.out.println(ad);
      
      // adding another element at the end
      ad.offer(40);
      
      // printing again
      System.out.println(ad);
  }
}
