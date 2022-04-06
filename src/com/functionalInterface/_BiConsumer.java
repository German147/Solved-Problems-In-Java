package com.functionalInterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {

        Celator german = new Celator("German", "456789123");
        greetCelator.accept(german,false);

    }

    static BiConsumer<Celator, Boolean> greetCelator = ((celator, showPhoneNum) -> System.out.println(
                    "Hello " + celator.celatorName + " , Thanks for registering " +
                            " your phone number " +  (showPhoneNum ? celator.celatorPhoneNumber : "***********")));


    static class Celator {
        private final String celatorName;
        private final String celatorPhoneNumber;

        public Celator(String celatorName, String celatorPhoneNumber) {
            this.celatorName = celatorName;
            this.celatorPhoneNumber = celatorPhoneNumber;
        }
    }
}
