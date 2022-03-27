package com.TAUchapters.chapter_7a_Arrays;

public class Avacado {

        public static void main(String[] args) {
            countWords("avacado");
        }

        /**
         * Splits a String into an array by tokenizing it.
         * Counts words or spaces and prints them
         * @param text Full string to be split
         */
        private static void countWords(String text){
            var words = text.split("a");
            int numberOfElements = words.length;
            System.out.println(numberOfElements);

            String message = String.format("The text contains %d elements: ", +numberOfElements);
            System.out.println(message);

            for (int i = 0; i < numberOfElements; i++) {
                System.out.println(words[i]);

            }
        }
}
