package com.TAUchapters.chapter_7a_Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTickets {
    //In CAPITAL variables does NOT change over the execution of the program
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    /**
     * Here we set the elements of an Array
     *
     * @return Here we get the random numbers of a lottery ticket
     */
    private static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            /*   whatever randon number were generate under a given number
             always the 0 cero is counted, so we have to add "+1" after the bound.
            */
            int randomNumber;
              /*
        Generate random number then search to make sure it doesn't
        already exist in the array. If it does, regenerate and search again.
        */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * In the followung method we print the ticket with its numbers
     */
    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value
     *
     * @param array             Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
    /*
    This is called an enhanced loop.
    It iterates through 'array' and
    each time assigns the current element to 'value'
    */
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }

        }
         /*
    If we've reached this point, then the entire array was searched
    and the value was not found
    */
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        //Array must be sorted first - it is in ascending order
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else return false;

    }

}
