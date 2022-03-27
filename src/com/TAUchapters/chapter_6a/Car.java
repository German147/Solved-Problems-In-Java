package com.TAUchapters.chapter_6a;

public class Car {

    private String gasoline;
    private float kilometers;
    private float litres;

    public Car() {
    }

    public Car(String gasoline, float kilometers, float litres) {
        this.gasoline = gasoline;
        this.kilometers = kilometers;
        this.litres = litres;
    }

    public String getGasoline() {
        return gasoline;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline;
    }

    public float getKilometers() {
        return kilometers;
    }

    public void setKilometers(float kilometers) {
        this.kilometers = kilometers;
    }

    public float getLitres() {
        return litres;
    }

    public void setLitres(float litres) {
        this.litres = litres;
    }

    public double calculateConsumption() {
        return  kilometers / litres;
    }
}
