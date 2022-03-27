package com.TAUchapters.chapter_7a_Arrays;

public class AddSpaces {
    public static void main(String[] args) {
        addSpace("HolaComoEstasEnEsteDiaTanEspecial");
    }
        /**
         * Adds space before each uppercase letter
         *
         * @param text jumbled Text
         */
        private static void addSpace (String text){
            //here we use StringBuilder.() coz it allow us to modify a String
            var modifiedText = new StringBuilder(text);
            for (int i = 0; i < modifiedText.length(); i++) {
                //i!=0 means this is not the first letter of the String
                //Character wrapper class calls .isUpperCase() method; so here we re saying
                //if this character is upperCase
                if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                    //then take this modifiedText and insert a space
                    modifiedText.insert(i, " ");
                    //here we move on the next character
                    i++;
                }
            }
            System.out.println(modifiedText);
        }

}
