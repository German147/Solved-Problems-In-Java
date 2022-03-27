package com.fundamentals.chapter_2_8;

import java.util.Scanner;

public class VehicleConsumption {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's check or car's consumptions!!");
        double kilometers = getKilomiters();
        double price = getPricePerLits();
        double klperLts = getKmL();
        scanner.close();
        double inLts = consumedLiters(kilometers, klperLts);
        double inPrice = consumedInPrice(klperLts, price);
        boolean over16 = isHighConsumerCar(inPrice);
        notifyUserConsumption(over16);
        System.out.println("The amount of liters consumed is: " + inLts + " lts.");
        System.out.println("The money required for those liters is $  " + inPrice);

    }

    private static void notifyUserConsumption(boolean over16) {
        if (over16) {
            System.out.println("Great! It is low consumer car.");

        } else {
            System.out.println("It is a high consumer car.");
        }
    }

    private static boolean isHighConsumerCar(double klperLts) {
        if (klperLts > 16) {
            return true;
        }
        return false;
    }

    private static double consumedInPrice(double klperLts, double price) {
        double inPrice = klperLts * price;
        return inPrice;
    }

    private static double consumedLiters(double kilometers, double klperLts) {
        double inLts = kilometers / klperLts;
        return inLts;
    }

    private static double getKmL() {
        System.out.println("Enter the kilometer pero liters consumed");
        double klmPerLits = scanner.nextDouble();
        return klmPerLits;
    }

    private static double getPricePerLits() {
        System.out.println("Please, now enter the price per lts. of the fuel: ");
        double price = scanner.nextDouble();
        return price;
    }

    private static double getKilomiters() {
        System.out.println("Enter the amount kilometers: ");
        double klms = scanner.nextDouble();
        return klms;
    }


}
