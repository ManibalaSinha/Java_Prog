package com.example.android.java;

import java.util.Stack;

public class StackOp {
    public static void  main(String[] a){
        Stack st = new Stack();
        //st.push();
        StackOp s = new StackOp();
        System.out.println("Stack" + st);
        s.insert(st,20);
        s.insert(st, 30);


    }
    void insert(Stack st, int a){
        st.push(a);
        System.out.println(a);
        System.out.println(st);
    }
}
