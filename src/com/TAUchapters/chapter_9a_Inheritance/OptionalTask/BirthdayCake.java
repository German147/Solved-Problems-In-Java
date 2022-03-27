package com.TAUchapters.chapter_9a_Inheritance.OptionalTask;

public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake() {
        super("flavor");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
