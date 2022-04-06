package com.ImperativeAproach;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static com.ImperativeAproach.Imperative1.Gender.FEMALE;
//import static com.ImperativeAproach.Imperative1.Gender.MALE;
//
//public class Imperative1 {
//    public static void main(String[] args) {
//        List<Students> alumnos =  List.of(
//            new Students("Lean", MALE  ),
//            new Students("marti", FEMALE),
//            new Students("german", MALE),
//            new Students("Evange", FEMALE)
//        );
//        System.out.println("Aplico el for each");
//        alumnos.forEach(System.out::println);
//
//        System.out.println(" //Declarative Approach");
//        //Declarative Approach
//        alumnos.stream().filter(students -> FEMALE.equals(students.gender))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//
//
//        System.out.println("//imperative approach");
//        //imperative approach
//        List<Students> females = new ArrayList<>();
//
//        for (Students student : alumnos){
//            if (FEMALE.equals(student.gender)){
//                females.add(student);
//            }
//        }
//      for (Students female : females){
//          System.out.println(female);
//      }
//
//      List<Students> male = new ArrayList<>();
//
//      for (Students students1 : alumnos){
//          if (MALE.equals(students1.gender)){
//              male.add(students1);
//          }
//      }
//      for (Students males : male){
//          System.out.println(males);
//      }
//    }
//
//    public static class Students{
//        private final String name;
//        private final Gender gender;
//
//        public Students(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Students{" +
//                    "name='" + name + '\'' +
//                    ", gender='" + gender + '\'' +
//                    '}';
//        }
//    }
//    enum Gender{
//        MALE, FEMALE
//    }
//}
