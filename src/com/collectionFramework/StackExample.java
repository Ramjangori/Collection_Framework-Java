package com.collectionFramework;

import java.util.Stack;

/*
 * Stack:
 * ------
 * - Stack is a class in Java
 * - It follows LIFO principle (Last In First Out)
 * - Stack extends Vector, so it is NOT a pure stack
 * - Because it extends Vector, it also supports List methods
 */

public class StackExample {
    public static void main(String[] args) {

        // Creating a Stack object of Integer type
        Stack<Integer> stack = new Stack<>();

        // push() method:
        // Used to insert an element at the top of the stack
        stack.push(5);
        stack.push(30);

        /*
         * remove(index):
         * This is NOT a stack method
         * It is inherited from Vector/List
         * remove(0) removes element at index 0
         * This breaks LIFO behavior
         */
        stack.remove(0);

        // Printing the stack
        System.out.println(stack);
    }
}
