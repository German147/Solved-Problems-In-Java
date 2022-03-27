package com.TAUchapters.Chapter_11_Interfaces;

public class Pig extends Animal implements AnimalMorningActions, AnimalAfternoonActions {

    @Override
    public void makeSound() {
        System.out.println("This is the honk hoink sound!!");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        System.out.println("the pig is drinking");
    }

    @Override
    public void takeNap() {
        AnimalAfternoonActions.super.takeNap();
    }

    @Override
    public void scratchBack() {

    }


}
