package com.example.android.java;

public class AddDiffNo {
    public static void main(String[] args){
    //2+4+8+9
    int n = 2489;
    int sum = 0;
    while(n>0)

    {
        int rem;
        rem = n % 10;
        sum = sum + rem;
        n = n / 10;
    }

    n=sum;
    System.out.println(sum);
}

}
