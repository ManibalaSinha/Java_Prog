package com.example.android.java;


import java.util.Arrays;


public class Search_Array {
    public static int searchArray(int[] arr, int elm){
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == elm){
                return i;
        }
        i+=Math.abs(elm-arr[i]);
        }
        return -1;
    }
    public static void main(String[] args){
       int[] arr = {2,3,4,6};
        int elm = 21;
        int ser;
       ser= searchArray(arr, elm);

       System.out.println(ser);

}

}
