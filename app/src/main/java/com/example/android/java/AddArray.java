package com.example.android.java;

import java.util.Arrays;

public class AddArray {
    public static int[] add(int[] first, int[] sec){
        int length= first.length<sec.length? first.length: sec.length;
        int[] result = new int[length];
        for (int i=0;i<length;i++){
            result[i]=first[i]+sec[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] even={2,4,6};
        int[] odd={1,3,5};
       int[] result= add(even, odd);
        System.out.println("Sum of array"+ Arrays.toString(result));
    }
}
