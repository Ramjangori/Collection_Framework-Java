package com.wrapperClass;

// Wrapper Class: For every primitive data type,
// there is a corresponding class called Wrapper Class
// Example: int → Integer

class Test1 {
    Integer a; // Wrapper class variable
    int b;     // Primitive data type

    Test1(int x, Integer y) {
        this.a = x; // Autoboxing: int → Integer
        this.b = y; // Unboxing: Integer → int
        System.out.println(a + " " + b);
    }
}

public class Demo {
    public static void main(String[] args) {
        Test1 t = new Test1(23, 45);
    }
}
