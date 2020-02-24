//Sagar Patel, CSCI1660, 2/18/2020

package com.company.Patel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The message is: " + promptString());
        System.out.println("The integer is: " + promptInt());
        System.out.println("The number is: " + promptDouble());
    }

    public static String promptString() {
        boolean pass = true;
        String message = "";
        while (pass) {
            try {
                System.out.println("What is your message?");
                message = input.nextLine();
                Integer.parseInt(message);
                pass = true;
                System.out.println("Message was entered in incorrectly.");
            } catch (Exception e) {
                pass = false;
            }
        }
        return message;
    }

    public static int promptInt() {
        boolean pass = true;
        int integer = 0;
        while (pass) {
            try {
                System.out.println("What is your integer?");
                integer = input.nextInt();
                pass = false;

            } catch (InputMismatchException e) {
                System.out.println("The input was entered in incorrectly.");
                input.next();
                pass = true;
            }
        }
        return integer;
    }

    public static double promptDouble() {
        boolean pass = true;
        double number = 0;
        while (pass) {
            try {
                System.out.println("What is your number?");
                number = input.nextDouble();
                pass = false;

            } catch (InputMismatchException e) {
                System.out.println("The input was entered in incorrectly.");
                input.next();
                pass = true;
            }
        }
        return number;
    }

}
