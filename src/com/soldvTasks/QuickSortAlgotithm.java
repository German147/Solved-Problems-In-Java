package com.soldvTasks;

import java.util.Arrays;

public class QuickSortAlgotithm {
    public static void main(String[] args) {

        int[] ages = {7, 24, 85, 35, 64, 14, 47, 23, 94, 18, 27, 38};
        int numberOfAges = 12;
        for (int i = 0; i < numberOfAges; i++) {
            Arrays.sort(ages);
            System.out.print(ages[i] + "-");
        }
    }
}
