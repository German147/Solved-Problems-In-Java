package com.TAUchapters.chapter_7a_Arrays;

public class ReverseToString {
    public static void main(String[] args) {
        reverseString("Evangelina");
    }

    /**
     * Prints a String in reverse order
     * @param text Sting to reverse
     */
    private static void reverseString(String text) {
        var lastCharacter = 1;//because every array starts to 0
        //i>=0 means to count from the front
        //i-- that is coz it goes backwards
        for (int i = text.length()- lastCharacter; i >=0 ; i--) {
            //here we call the .charAt() coz it is an object
            System.out.print(text.charAt(i));
            
        }
    }
}
