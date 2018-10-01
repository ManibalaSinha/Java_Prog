package com.example.android.java;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){

        int n, num=1, c,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of triangle you want");
        n = in.nextInt();
        System.out.println();
        for (c=1;c<=n;c++){
            for (d=1;d<=c;d++)
            {
                System.out.println(num+"");
                num++;
            }
            System.out.println();//go to next line6
        }
    }
}
