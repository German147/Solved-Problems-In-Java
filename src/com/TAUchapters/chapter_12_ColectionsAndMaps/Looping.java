package com.TAUchapters.chapter_12_ColectionsAndMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Looping {
    public static void main(String[] args) {
//        setDemo();
      listDemo();
//        queueDemo();
  //      mapDemo();
    }

//    private static void setDemo() {
//        Set<String> fruit = new HashSet();
//        fruit.add("apple");
//        fruit.add("lemon");
//        fruit.add("banana");
//        fruit.add("orange");
//        fruit.add("lemon");
//        fruit.add("pine-apple");
//        fruit.add("water-melon");

//        var l = fruit.iterator();
//        while (l.hasNext()) {
//            System.out.println(l.next());
//        }
//        for (String item : fruit) {
//            System.out.println(item);
//        }
//        fruit.forEach(g -> System.out.println(g));

    //        fruit.forEach(System.out::println);
//    }

    public static void mapDemo() {

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);



//        for (var entry : fruitCalories.entrySet()) {
//            System.out.println(entry.getValue() +" calories for  "+ entry.getKey());
//        }

//        fruitCalories.forEach(
//                (k,v)-> System.out.println("Fruit: " +k+ " , Calories " + v));

    }

    public static void listDemo() {

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("pine-apple");
        fruit.add("water-melon");

      //  System.out.println(fruit.get(1));


    }


}
