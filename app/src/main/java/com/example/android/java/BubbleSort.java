package com.example.android.java;

public class BubbleSort {
    static void BubbleSort(int[] arr){
        int n = arr.length;
        int temp =0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(arr[j-1]>arr[j]){
                    temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {3,60,24,43};
        BubbleSort(arr);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
