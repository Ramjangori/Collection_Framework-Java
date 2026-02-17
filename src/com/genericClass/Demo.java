package com.genericClass;

/*
 * Generic Class:
 * Allows a class to work with different data types
 * Data type is decided at object creation time (compile time)
 * <> is used to specify the type parameter
 */

class Test2<T> {
    T value;

    Test2(T value) {
        this.value = value;
        System.out.println(value);
    }

    T getValue() {
        return value;
    }
}

public class Demo {
    public static void main(String[] args) {

        Test2<Integer> t = new Test2<>(4); // T becomes Integer
        System.out.println(t.getValue());
    }
}
