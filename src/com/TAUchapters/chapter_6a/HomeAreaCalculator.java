package com.TAUchapters.chapter_6a;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /****************
         *RECTANGLE1
         ***************/
        Rectangle room1 = new Rectangle();
        room1.setLength(3.5);
        room1.setWidth(4);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of room 1 is: " + areaOfRoom1);
        /****************
         *RECTANGLE1
         ***************/

        Rectangle room2 = new Rectangle(30, 21);


    }
}
