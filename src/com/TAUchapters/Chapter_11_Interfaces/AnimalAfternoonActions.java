package com.TAUchapters.Chapter_11_Interfaces;

public interface AnimalAfternoonActions {

    default void takeNap(){
        System.out.println("I am too sleep so I am going to sleep");
    }
     void scratchBack();
}
