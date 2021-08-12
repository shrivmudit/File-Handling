package com.company;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class DataFile {
    public static void main(String[] args) {
        try {
            File myfile = new File("datafile.txt");
            if (myfile.createNewFile()) {
                System.out.println("The file" + myfile.getName() + "is created");

            } else {
                System.out.println("Already Existed");
            }


        } catch (IOException e) {
            System.out.println(e);


        }
    }
}

