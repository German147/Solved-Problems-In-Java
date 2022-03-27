package com.generics;

import java.util.ArrayList;

public class GenericsAndUpcasting {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fiji());
        apples.add(new Braeburn());
        for (Apple c : apples)
            System.out.println(c);
    }

    static class GrannySmith extends Apple {
    }

    static class Gala extends Apple {
    }

    static class Fiji extends Apple {
    }

    static class Braeburn extends Apple {
    }

    static class Apple {
        private long counter;
        private final long id = counter++;

        public long id() {
            return id;
        }
    }
}
