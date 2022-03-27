package com.TAUchapters.chapter_10_Polymorphism.TaskHomework;

public class Apple extends Fruit {
    public Apple() {
        super(75);
    }


    @Override
    public void makeJuice() {
        System.out.println("Make Apple Juice!!");
    }

    @Override
    public void peel() {
        System.out.println("Peel the apple");
    }

    public void takeOutTheGrabStickApple() {
        System.out.println("Take out the little stick and leave");
    }

    public void cutTheApple() {
        System.out.println("Cut the apple in 4 halves");
    }

    public void removeSeeds() {
        System.out.println("Remove the Apple seeds");
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public void setCalories(int calories) {
        super.setCalories(calories);
    }

    @Override
    public void washTheFruit() {
        System.out.println("The Apple is washed");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
