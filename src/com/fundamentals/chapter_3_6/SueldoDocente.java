package com.fundamentals.chapter_3_6;

import java.util.Scanner;

public class SueldoDocente {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int positionTeacher = gettingPositionTeacher();
        int workingYears = gettingYearsOfWork();
        int netIncome = gettingIncome(positionTeacher);
        int percentage = gettingPercentage(workingYears);
        double totalSalary =calculateNetIncomeByWorkingYears(netIncome, percentage);
        System.out.println("The total salary according to your working years and " +
                "working situation is " + totalSalary);
    }

    public static int gettingPositionTeacher() {
        System.out.println("Enter your teacher situation:" +
                "Hit 1 if you are a permanent Teacher and hit 2 if you are a " +
                "transitional teacher");
        int positionTeacher = scanner.nextInt();
        return positionTeacher;
    }

    public static int gettingYearsOfWork() {
        System.out.println("Please, enter the number of working years");
        int workingYears = scanner.nextInt();
        return workingYears;
    }

    public static int gettingIncome(int positionTeacher) {
        int netIncome;
        if (positionTeacher == 1) {
            netIncome = 50000;
        } else {
            netIncome = 35000;
        }
        return netIncome;
    }

    public static int gettingPercentage(int workingYears) {
        int percentage;
        if (workingYears >= 7 && workingYears < 7) {
            percentage = 3;
        } else if (workingYears >= 10 && workingYears < 10) {
            percentage = 5;
        } else if (workingYears >= 10) {
            percentage = 10;
        } else percentage = 0;
        return percentage;
    }

    public  static  double calculateNetIncomeByWorkingYears(int netIncome, int percentage){
        double totalSalary = netIncome + (percentage * netIncome / 100);
        return totalSalary;
    }
}
