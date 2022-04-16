package com.functional_Interface;

import java.util.function.BiFunction;

public class _BiFunction {
    /**
     * Bi function takes two arguments and give one result
     * @param args
     */
    public static void main(String[] args) {

        Integer resulTado = sumaYMultiplicaFunction.apply(4, 100);
        System.out.println(resulTado);
    }

    static BiFunction<Integer, Integer, Integer> sumaYMultiplicaFunction =
            (numToIncrementByOne,numToMultiPLy) -> (numToIncrementByOne + 1) * numToMultiPLy;

    static int sumaYMultiplica(int num, int numToMultiply){
        return (num + 1) * numToMultiply;
    }
}
