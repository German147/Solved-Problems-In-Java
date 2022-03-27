package com.TAUchapters.chapter_13_Exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {

        //   createNewFile();
        try {
            int c = 30 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun!!");
        }
    }
}

//    private static void createNewFile() {
//        File file = new File("resources/fakeresourse.txt");
//
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("DIRECTORY DOES NOT EXIST");
//            e.printStackTrace();
//        }
//    }
