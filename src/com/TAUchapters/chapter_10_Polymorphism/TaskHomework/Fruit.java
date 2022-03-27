package com.TAUchapters.chapter_10_Polymorphism.TaskHomework;

public class Fruit {
    private int calories;

    public Fruit() {
    }

    public Fruit(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made!!");
    }
    public void washTheFruit(){
        System.out.println("The fruit is washed");
    }
    public void peel() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "calories=" + calories +
                '}';
    }
}
