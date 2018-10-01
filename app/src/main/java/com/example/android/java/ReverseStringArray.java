package com.example.android.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {
    public  static void main(String args[]){
       //String array
        String[] strDays = new String[]{"Monday","Sunday"};
        List<String> list = Arrays.asList(strDays);
        Collections.reverse(list);
        strDays = (String[])list.toArray();
        for(int i=0; i<strDays.length;i++)
            System.out.println(strDays[i]);
    }
}
