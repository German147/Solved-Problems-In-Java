package com.fundamentals.chapter_2_4;

// Write a method that asks a user for their name, then greets them by name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        //passing that variable to a method
        String name = getUserName();
        greetUser(name);

    }

    private static String getUserName() {
        //Getting user information
        System.out.println("Enter your name");
        //saving the input into a variable
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    private static void greetUser(String name) {
        System.out.println("Hi there " + name);
    }
}
