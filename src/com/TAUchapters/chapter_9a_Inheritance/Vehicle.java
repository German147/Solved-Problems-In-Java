package com.TAUchapters.chapter_9a_Inheritance;

public class Vehicle {

    private int horsePower;
    private int gearNumber;
    private String gasolineUsed;

    public Vehicle(){
        System.out.println("Iam Vehicle constructor");
    }
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public String getGasolineUsed() {
        return gasolineUsed;
    }

    public void setGasolineUsed(String gasolineUsed) {
        this.gasolineUsed = gasolineUsed;
    }

    public void drive(){
        System.out.println("Iam drive Vehicle");
    }
}
