package com.TAUchapters.chapter_7a_Arrays;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */
public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades are there?");
        grades = new int[scanner.nextInt()];
        getGrades();
      //  calculateSum();
       // calculateAverage();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
       // getHighest();
       // getLowest();
        System.out.println("The highest Temperature is " + getHighest());
        System.out.println("The Lowest Temperature is " + getLowest());
    }

    private static int getLowest() {
        //definimos e inicializamos la variable al primer numero del array
        int lowest = grades[0];
        //iteramos en el for y asignamos el mayor valor a lowest.
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    private static int getHighest() {
        //definimos e inicializamos la variable al primer numero del array
        int highest = grades[0];
        //iteramos en el for y asignamos el mayor valor a highest.
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    private static int calculateSum() {
        //definimos e iniciamos la variable acumulador
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    private static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grades: " + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

}
