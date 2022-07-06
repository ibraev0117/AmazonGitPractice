package com.digital_nomads.javaFall2021;

import java.lang.reflect.Array;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int a [] = new int[3];
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong");
        }
    }
}
