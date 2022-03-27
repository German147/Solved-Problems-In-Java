package com.fundamentals.chapter_2_10;

import java.util.Scanner;

/*Develop a program to calcualte the age of the user at the end of this year*/
public class BirthYear {
    public static void main(String[] args) {
        int yearOfBirth = getAge();
        theAgeAtEndOfYear(yearOfBirth);
    }

    private static void theAgeAtEndOfYear(int yearOfBirth) {
        int actualYear = 2022;
        int finalYears = actualYear - yearOfBirth;
        System.out.println("By the end of this year you will have " + finalYears);
    }

    private static int getAge() {
        System.out.println("Please, enter the year of your birthday:");
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = scanner.nextInt();
        scanner.close();
        return yearOfBirth;
    }
}
