package com.generics;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
// Not prevented from adding an Orange to apples:
        apples.add(new Orange());
        for(int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
// Orange is detected only at run time
    }


    static class Orange {}

    static class Apple {
        private long counter;
        private final long id = counter++;
        public long id() { return id; }
    }
}
