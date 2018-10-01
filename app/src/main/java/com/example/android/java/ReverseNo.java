package com.example.android.java;

public class ReverseNo {
    public static void main(String[] args){
        int num=1234;
        int reverse=0;
        int temp=0;
        while (num>0){
            temp = num%10;
            reverse=reverse*10+temp;
            num= num/10;
        }
        System.out.println(reverse);
    }
}
