package com.basicprograms;

import java.util.Scanner;

public class CommandLineName {

    public static void commandLineName() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("Your name is: " + name);
        commandLineName();

    }

    public static void main(String[] args) {
    }
}

