package org.codedifferently;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       recieptcalculator recieptcalculator = new recieptcalculator();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Welcome to Masons Tech Emporium!");
       System.out.println("What is your name");
       String name = scanner.nextLine();
       System.out.println("What is your budget:");
       double budget = scanner.nextDouble();
       System.out.println("Enter your 5 digit rewards number");
       double rewardnumber = scanner.nextInt();
       if (rewardnumber == recieptcalculator.rewardsmemnum){
           recieptcalculator.rewardmember = true;
           System.out.println(recieptcalculator.generatethereceipt());
       } else {
           System.out.println(recieptcalculator.generatethereceipt());
       }






    }

}
