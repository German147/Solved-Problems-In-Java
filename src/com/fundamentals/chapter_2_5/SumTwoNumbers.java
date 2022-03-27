package com.fundamentals.chapter_2_5;

import java.util.Scanner;

public class SumTwoNumbers {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's sum two numbers...");
        int first = getfirstNumber();
        int second = getSecondNumber();
        scanner.close();
        int resultSum = totalSum(first, second);

        System.out.println("The result of the sum is " + resultSum);

    }

    public static int getfirstNumber() {
        System.out.println("Enter the first one, please");
        int num1 = scanner.nextInt();
        return num1;
    }

    public static int getSecondNumber() {
        System.out.println("Now enter the second one.");
        int num2 = scanner.nextInt();
        return num2;
    }

    public static int totalSum(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }
}
