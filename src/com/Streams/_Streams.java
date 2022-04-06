package com.Streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.Streams._Streams.Gender.*;
import static com.Streams._Streams.Gender.MALE;

public class _Streams {
    public static void main(String[] args) {

        List<Students> alumnos = List.of(
                new Students("Lean", MALE),
                new Students("marti", FEMALE),
                new Students("german", MALE),
                new Students("Evange", FEMALE));

//        alumnos.stream()
//                .map(students -> students.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        Predicate<Students> studentsPredicate = students -> FEMALE.equals(students.gender);

        boolean containsOnlyFemale = alumnos.stream()
                .anyMatch(studentsPredicate);
        System.out.println(containsOnlyFemale);

    }

    public static class Students {
        private final String name;
        private final Gender gender;

        public Students(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
