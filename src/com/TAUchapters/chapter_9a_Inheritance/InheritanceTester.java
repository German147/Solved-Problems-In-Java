package com.TAUchapters.chapter_9a_Inheritance;

import com.TAUchapters.chapter_9a_Inheritance.OptionalTask.Truck;

public class InheritanceTester {
    public static void main(String[] args) {
       // Person person = new Person();
       // Employee employee = new Employee();
       // Car car = new Car();
//        Mother mom = new Mother();
//        mom.setName("Maria");
//        mom.setAge(41);
//        System.out.println(mom.getName()+ " is a " + mom.getGender() + " of " + mom.getAge() + " years old");
        Vehicle car = new Car();
        clean(car);

    }
    public static void clean(Vehicle vehicle){
        if (vehicle instanceof Car){
            System.out.println("Let's clean the car");
        }
        else if (vehicle instanceof Truck){
            System.out.println("Let's Clean the Truck!!");
        }
    }
}
