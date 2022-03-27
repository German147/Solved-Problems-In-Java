package com.TAUchapters.chapter_7a_Arrays;

public class chpater7b_1TextProcessor {
    public static void main(String[] args) {
       countWords("I love Test Automation University");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    private static void countWords(String text){
         var words = text.split(" ");
         int numberOfWords_Elements = words.length;
        System.out.println(numberOfWords_Elements);

        String message = String.format("The text contains %d words: ", + numberOfWords_Elements);
        System.out.println(message);

        for (int i = 0; i < numberOfWords_Elements; i++) {
            System.out.println(words[i]);
            
        }
    }
}
