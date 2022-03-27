package com.TAUchapters.chapter_10_Polymorphism;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("woof, woof");
    }

    public void fetch(){
        System.out.println("Fetch sticks is fun!!");
    }
}
