package com.digital_nomads.javaFall2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException{

            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java night be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");


    }
}
