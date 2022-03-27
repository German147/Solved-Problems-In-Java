package com.TAUchapters.chapter_10_Polymorphism.TaskHomework;

public class Orange extends Fruit {
    public Orange() {
        super(63);
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange Juice is Made!!");
    }

    @Override
    public void washTheFruit() {
        System.out.println("the Fruit is Washed");
    }

    @Override
    public void peel() {
        System.out.println("The orange is careful peeled");
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public void setCalories(int calories) {
        super.setCalories(calories);
    }
    public void scuizOrange(){
        System.out.println("The Orange is scuized");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
