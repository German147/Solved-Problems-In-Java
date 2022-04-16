package com.Collections;

import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetDemoPractice {
    public static void main(String[] args) {
        // Create a hash set.
        HashSet<String> miHashSet = new HashSet<String>();
// Add elements to the hash set.
        miHashSet.add("Barco");
        miHashSet.add("Aanimal");
        miHashSet.add("Dedo");
        miHashSet.add("Estancia");
        miHashSet.add("Casa");
        miHashSet.add("Fruta");
        System.out.println(miHashSet.size());
        System.out.println(miHashSet.clone());
        System.out.println(miHashSet);
        miHashSet.stream().sorted().collect(Collectors.toSet());



    }
}
