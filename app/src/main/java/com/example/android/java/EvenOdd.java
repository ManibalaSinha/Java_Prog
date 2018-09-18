package com.example.android.java;

public class EvenOdd {
    public  static  void main(String[] args){
        int[] num = new  int[]{2,8,3,7,62,983,3};
        for(int i=0; i<num.length; i++)
        {
            if(num[i]%2 == 0)
                System.out.println("even" + num[i]);
            else
                System.out.println(num[i]+"odd");
        }
    }
}
