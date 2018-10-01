package com.example.android.java;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args){
        LinkedList<String> students = new LinkedList<>();
        students.add("Charlie");
        students.add("Marlie");
        students.add("Tarlie");
        students.add("Karlie");
        students.addFirst("Sarah");
        students.addLast("Hiely");
        students.add(2, "Tara");
        String firstStudent = students.getFirst();
        System.out.println("FirstStudent"+ firstStudent);
        String lastStudent = students.getLast();
        System.out.println("LastStudent"+ lastStudent);
        System.out.println(students.size());
        System.out.println(students);


    }
}
