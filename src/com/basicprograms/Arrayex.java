package com.basicprograms;
class Student{
    String name;

}

public class Arrayex {
    public static void main(String[] args) {
        Student obj  = new Student();
        obj.name = "Aditya";
        Student obj2  = new Student();
        obj2.name = "Nitish";

        System.out.println(obj.name);

        Student students[] = new Student[2];
        students[0] = obj;
        students[1] = obj2;

        //for (int i=0;i,students.length;i++){

        }

    }

