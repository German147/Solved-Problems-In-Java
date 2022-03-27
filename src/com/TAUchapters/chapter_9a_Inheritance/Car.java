package com.TAUchapters.chapter_9a_Inheritance;

public class Car extends Vehicle {
    private String brand;
    private String color;
    private String gps;

    public Car(){
        System.out.println("I am car's Constructor");
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void drive(){
        System.out.println("Iam drive Car");
    }
}
