package com.Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {

        Function<String,String> upperCaseName = name ->{
            //logic
          if (name.isBlank())throw new IllegalArgumentException(" ");
            System.out.println(name);
            return name.toUpperCase();
        };

        String germanPrintable = upperCaseName.apply("German");
        System.out.println(germanPrintable);


        System.out.println("here comas the biFuntion \n");
        BiFunction<String,Integer, String> upperCaseName1 = (name, age) ->{
            //logic
            if (name.isBlank())throw new IllegalArgumentException(" ");
            System.out.println(name);
            return name.toUpperCase();
        };

        System.out.println( upperCaseName1.apply("Ger",35));


    }
}
