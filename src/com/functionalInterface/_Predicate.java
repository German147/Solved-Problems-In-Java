package com.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNUmberValid("07000000000"));

        System.out.println("Predicate Function ");
        System.out.println(isPhoneNumberValidFunction.test("07000000000"));

        // chaining Predicate
        System.out.println("chaining Predicate " +
                isPhoneNumberValidFunction.or(contains3).test("040003000074")
        );

    }
    //function Predicate
    static Predicate<String> isPhoneNumberValidFunction = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    //function 2
    static Predicate<String> contains3 = phoneNumber2 ->
            phoneNumber2.contains("3");

    //normal method or function
    static boolean isPhoneNUmberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
