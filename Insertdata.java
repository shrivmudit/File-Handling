package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class Insertdata{
    public static void main (String[] args){
        String Data1 = "Details of Mudit\n";
        String Data = "Mudit , 207 , SRM , NCR, ";
        try {
            FileWriter writer = new FileWriter("Datafile.txt");
            writer.write(Data1);
            writer.write(Data);
            writer.close();
            System.out.println("The data has been inserted");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}