package com.fundamentals.chapter_2_6;

import java.util.Scanner;

public class ProductOfNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's run a program to multiply two numbers");
        double number1 = getFirstNumber();
        double number2 = getSecondNumber();
        double result = multiplyNumbers(number1, number2);
        boolean over20 = isTheResultOverTwenty(number1, number2);
        notifyUserMultiplication(over20);
        System.out.println("It is " + result);
    }

    private static void notifyUserMultiplication(boolean isOver20) {
        if (isOver20) {
            System.out.println("The result is over 20!!");
        } else
            System.out.println("The result is less than 20...");
    }

    private static boolean isTheResultOverTwenty(double number1, double number2) {
        if ((number1 * number2) > 20) {
            return true;
        } else return false;
    }

    public static double getFirstNumber() {
        System.out.println("Enter the first number");
        double num1 = scanner.nextInt();
        return num1;
    }

    public static double getSecondNumber() {
        System.out.println("Enter the second number");
        double num2 = scanner.nextInt();
        return num2;
    }

    public static double multiplyNumbers(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

}
