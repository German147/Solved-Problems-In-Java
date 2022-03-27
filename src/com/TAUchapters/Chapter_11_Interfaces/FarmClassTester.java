package com.TAUchapters.Chapter_11_Interfaces;

public class FarmClassTester {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.eat();
        duck.makeSound();
        System.out.println("----------------------");
        Pig pig = new Pig();
        pig.eat();
        pig.drink();
        pig.makeSound();

    }
}
