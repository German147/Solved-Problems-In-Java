package com.TAUchapters.chapter_6a;

//Let's write a class that describes the fields and methods of a rectangle.
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way. these are only different here to demo alternative options
    }

    double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
