package com.TAUchapters.chapter_10_Polymorphism.TaskHomework;

public class TestingFruitMarketClass {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.washTheFruit();
        apple.peel();
        apple.takeOutTheGrabStickApple();
        apple.cutTheApple();
        apple.removeSeeds();
        apple.setCalories(25);
        System.out.println("------------------------------");
            Fruit juicGerman = new Apple();
            juicGerman.makeJuice();
        System.out.println("cambianmos el tipo de fruta-------------- al mismo objeto, y con ello sus metodos");
            juicGerman = new Orange();
            juicGerman.makeJuice();
        ((Orange) juicGerman).scuizOrange();
    }
}
