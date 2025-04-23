package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        String fileName = "src/data/employees.csv";
        try {
            FileReader fileReader = new FileReader("src/data/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;

            while ((input = bufReader.readLine()) != null){
                System.out.println(input);
            }
            bufReader.close();


        } catch (IOException e) {
//            throw new RuntimeException();
            e.fillInStackTrace();
        }

    }
}
