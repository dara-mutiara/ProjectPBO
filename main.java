package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Giga gg = new Giga();
        gg.setGiga(4);
        //mencetak file
        try {
            System.out.println("\n");
            File myfile = new File("KonversiGBtoMB.txt");
            if(!myfile.exists()){
                myfile.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(myfile);
            printWriter.println(" ");
            printWriter.println("Ukuran dalam Gigabytes\t: "+gg.getGiga());
            printWriter.print("Konversi ke Megabytes\t: "+gg.getMega());
            printWriter.close();
            System.out.println("File Telah Dibuat");
        }catch (IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
        //membaca file
        String filename = "KonversiGBtoMB.txt";
        try {
            System.out.println("Baca File KOnversiGBtoMB.txt");
            File myfile = new File(filename);
            Scanner fileReader = new Scanner(myfile);

            //cetak isi file
            while (fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
