package com.TAUchapters.chapter_10_Polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow, meow");
    }

    public void scratch() {
        System.out.println("I am a cat and I love scratch");
    }
}
