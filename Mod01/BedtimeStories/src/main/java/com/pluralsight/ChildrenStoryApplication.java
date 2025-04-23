package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ChildrenStoryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            displayStories();
            String fileName = scanner.nextLine();
            while (scanner.hasNextLine()){
                fileName = scanner.nextLine();
                System.out.println(fileName);
                FileInputStream fis = new FileInputStream("golidlocks.txt");
            }
        } catch (FileNotFoundException e) {

        }
        scanner.close();

    }
    public static void displayStories(){
        System.out.println("Please Choose a Story:");
        System.out.println("1. goldilocks.txt");
        System.out.println("2. hansel_and_gretel.txt");
        System.out.println("3. mary_had_a_little_lamb");
        System.out.println("Enter Story of Choice:");
    }
}
