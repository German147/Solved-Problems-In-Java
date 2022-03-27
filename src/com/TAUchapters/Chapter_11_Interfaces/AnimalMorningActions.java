package com.TAUchapters.Chapter_11_Interfaces;

public interface AnimalMorningActions {

    default void wakeUp(){
        System.out.println("I have just waken up!! ");
    }
    void drink();


}
