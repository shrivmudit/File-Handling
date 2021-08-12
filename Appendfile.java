package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Appendfile{
    public static void main(String[] args){
        String Data = " , 110093";
        try {
            FileWriter writer = new FileWriter("Datafile.txt", true);
            writer.write(Data);
            writer.close();
            System.out.println("The data has been Appended");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    }
