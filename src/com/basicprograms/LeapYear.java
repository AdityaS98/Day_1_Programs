package com.basicprograms;

import java.util.Scanner;

public class LeapYear {

    public static void leapYearCalculation() {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year");
        year = sc.nextInt();

        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args) {

        leapYearCalculation();
    }
}
