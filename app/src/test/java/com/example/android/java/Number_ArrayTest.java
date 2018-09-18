package com.example.android.java;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Number_ArrayTest {
    public static void main(String[] args){
        int[] a={1,2,3};
        boolean y = Arrays.asList(a).contains(3);

        System.out.println(y);
    }

}