package com.example.android.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args)throws Exception{
        String username=null;
        System.out.println("Enter your name");
        //open up standard input and buffer it
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            username = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(username);
    }
}
