package com.fundamentals.chapter_2_9;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersOperations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = getFirstNumber();
        int num2 = getSecondNumber();
        int option = chosingAnOperation();
        scanner.close();
       performOperatons(option,num1,num2);
    }

    private static void performOperatons(int option, int num1, int num2) {
        switch (option){
            case 1:
                int add = num1 + num2;
                System.out.println("The sum is " + add);
                break;
            case 2:
                int difference = num1 - num2;
                System.out.println("The difference is " +difference);
                break;
            case 3:
                int multiply = num1 * num2;
                System.out.println("The multiplication of these numbers is " + multiply);
                break;
            case 4:
                int division = num1 / num2;
                System.out.println("The division is : " + division);
                break;
        }

    }

    private static int chosingAnOperation() {
        System.out.println("Now choose one number to perform its operation:" +
                "1-Add, 2-Show Diference,3-Multiply nad 4-Divide the numbers");
        int option = scanner.nextInt();
      return option;
    }

    private static int getSecondNumber() {
        System.out.println("Now hit enter again to get the second number..");
        // the next scanner is just to give time the user to hit enter
        String luckyNumber2 = scanner.nextLine();
        Random number2 = new Random();
        int num2 = number2.nextInt(100) + 1;
        System.out.println("Your second number is: " + num2);
        return num2;
    }

    private static int getFirstNumber() {
        System.out.println("Hit enter to get a random number to do some maths operations");
        // the next scanner is just to give time the user to hit enter
        String luckyNumber = scanner.nextLine();
        Random num = new Random();
        int num1 = num.nextInt(100) + 1;
        System.out.println("Your first number is: " + num1);
        return num1;
    }

}
