package com.TAUchapters.chapter_9a_Inheritance.OptionalTask;

import com.TAUchapters.chapter_9a_Inheritance.Vehicle;

public class Truck extends Vehicle {
    private String engineMark;

    public Truck() {
    }

    public Truck(String engineMark) {
        this.engineMark = engineMark;
    }

    public String getEngineMark() {
        return engineMark;
    }

    public void setEngineMark(String engineMark) {
        this.engineMark = engineMark;
    }
}
