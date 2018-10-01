package com.example.android.java;

import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args){
        String[] strNames = new String[]{"Dog", "Cat"};
        Arrays.sort(strNames);
        for(int i=0; i<strNames.length;i++)
        System.out.println(strNames[i]);
    }
}
