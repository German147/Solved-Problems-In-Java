package com.TAUchapters.Chapter_11_Interfaces;

public class Duck extends Animal{

    @Override
    public void makeSound() {
        System.out.println("This is the cual cuak sound!!");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
