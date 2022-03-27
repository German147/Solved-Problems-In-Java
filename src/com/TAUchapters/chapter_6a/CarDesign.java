package com.TAUchapters.chapter_6a;

import java.util.Scanner;

public class CarDesign {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CarDesign createCar = new CarDesign();
        Car alfaRomeo = createCar.getCar();
        Car renault = createCar.getCar();
        Car fiat = createCar.getCar();
        double totalConsumption = createCar.calculateTotalConsumption(alfaRomeo, renault, fiat);
        System.out.println("The total consumption of Alfa Romeo is: " + totalConsumption);
        scanner.close();
    }

    private double calculateTotalConsumption(Car alfaRomeo, Car renault, Car fiat) {
        return alfaRomeo.calculateConsumption();
    }


    private Car getCar() {
        System.out.println("Let's Create a new car");

        System.out.println("Enter the gasoline used");
        String gasoline = scanner.nextLine();

        System.out.println("Enter the kilometers covered");
        float kilometers = scanner.nextFloat();

        System.out.println("Enter the liters consumed");
        float liters = scanner.nextFloat();

        return new Car(gasoline, kilometers, liters);
    }
}
