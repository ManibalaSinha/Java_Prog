package com.example.android.java;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] num = {3,2,3,4,5};
        Arrays.sort(num);
        for(int numbers:num ){
            System.out.println(numbers);
        }
    }
}
