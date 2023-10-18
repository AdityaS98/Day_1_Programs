package com.basicprograms;

public class StaticBlock {

     static int staticVariable = 0;


    static {
        System.out.println("Inside the static block.");
        staticVariable = 5;
    }


    public static void staticMethod() {
        System.out.println("Inside the static method.");
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Inside the main method.");
        staticMethod();
    }
}

