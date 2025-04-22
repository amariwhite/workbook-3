package com.pluralsight;

import java.util.Scanner;

public class QuotesApplication {
    public static void main(String[] args) {

        String [] quotes ={"1. I am sick of following my dreams man. I'm just going to ask where they are going and hook up with 'em later." ,
                      "2. Life is like a box of chocolates, you never know what you'll get ",
                      "3. You miss 100% of the shots you don't take.",
                      "4. Be yourself; everyone else is already taken.",
                      "5. The only true wisdom is in knowing you know nothing.",
                      "6. It always seems impossible until it's done.",
                      "7. The journey of a thousand miles begins with a single step.",
                      "8. Happiness is not something ready made. It comes from your own actions.",
                      "9. Life is either a daring adventure, or nothing.",
                      "10. What we think, we become."};

        int quoteNumber = getQuoteNumber();
        displayQuote(quotes, quoteNumber);
        System.out.println("Do you want to select another quote? (Yes or No) ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

//        boolean keepRunningApplication = true;

        while (true){
            System.out.println("Select a number (1-10) to get a quote ");
            int selection = scanner.nextInt();

            if (selection >= 1 && selection <=10) {
                System.out.println("Quote; " + quotes[selection-1]);
            }
        }



//       quoteNumber = 0;
//
//
    }

    private static void displayQuote(String[] quotes, int quoteNumber) {
        try {
            System.out.println(quotes[quoteNumber -1]);
        } catch (Exception e) {
            System.out.println("Invalid Selection");
//            e.printStackTrace();
        }
    }

    private static int getQuoteNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a quote(1-10): ");
        int quoteNumber = scanner.nextInt();
        return quoteNumber;
    }
}
