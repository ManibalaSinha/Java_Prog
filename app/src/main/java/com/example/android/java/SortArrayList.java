package com.example.android.java;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(18);
        al.add(3);
        al.add(5);
        Collections.sort(al);
        for(int i=0;i< al.size();i++)
            System.out.println(al.get(i));

    }
}
