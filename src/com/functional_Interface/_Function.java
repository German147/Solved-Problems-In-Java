package com.functional_Interface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
//        int increment = incrementByOne(1);
//        Integer increment6 = incrementByOneFunction.apply(1);
//        System.out.println(increment6);
        Function<Integer, Integer> addByOneAndThenMultyplyByTen =
                incrementByOneFunction.andThen(multiplyBy10Function);

     //   System.out.println(addByOneAndThenMultyplyByTen.apply(3));
        int totalResult =  addByOneAndThenMultyplyByTen.apply(3);
        System.out.println(totalResult);


    }

   static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }
}
