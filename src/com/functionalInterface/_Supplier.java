package com.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        // System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlFunction.get());
    }

    //Function
    static Supplier<String> getDbConnectionUrlFunction = () ->
            "jdbc://localhost:5612/user/uvs/1";

    //method
    static String getDbConnectionUrl() {
        return "jdbc://localhost:5612/user/uvs/1";
    }

}
