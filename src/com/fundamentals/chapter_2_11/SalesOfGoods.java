package com.fundamentals.chapter_2_11;

import java.util.Scanner;

public class SalesOfGoods {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sales1 = getSalesGoods1();
        double price1 = getPriceGoods1();
        int sales2 = getSalesGoods2();
        double price2 = getPriceGoods2();
        int sales3 = getSalesGoods3();
        double price3 = getPriceGoods3();
        double total1 = totalSales1(sales1, price1);
        double total2 = totalSales2(sales2, price2);
        double total3 = totalSales3(sales3, price3);
        totalAmountOfSales(total1, total2, total3);
    }

    private static void totalAmountOfSales(double total1, double total2, double total3) {
        double completeTotal = total1 + total2 + total3;
        System.out.println("The total of sales is " + completeTotal);
    }

    private static double totalSales3(int sales3, double price3) {
        double totalSale3 = sales3 * price3;
        System.out.println("The amount of sales of the first article is " + sales3 +
                " and the total sold is " + totalSale3);
        return totalSale3;
    }

    private static double totalSales2(int sales2, double price2) {
        double totalSale2 = sales2 * price2;
        System.out.println("The amount of sales of the first article is " + sales2 +
                " and the total sold is " + totalSale2);
        return totalSale2;
    }

    private static double totalSales1(int sales1, double price1) {
        double totalSale1 = sales1 * price1;
        System.out.println("The amount of sales of the first article is " + sales1 +
                " and the total sold is " + totalSale1);
        return totalSale1;
    }

    private static double getPriceGoods3() {
        System.out.println("Enter the price of this item 3:");
        double priceGood3 = scanner.nextDouble();
        return priceGood3;
    }

    private static int getSalesGoods3() {
        System.out.println("Enter te number of sales 3:");
        int sales3Num = scanner.nextInt();
        return sales3Num;
    }

    private static double getPriceGoods2() {
        System.out.println("Enter the price of this item 2:");
        double priceGood2 = scanner.nextDouble();
        return priceGood2;
    }

    private static int getSalesGoods2() {
        System.out.println("Enter te number of sales 2:");
        int sales2Num = scanner.nextInt();
        return sales2Num;
    }

    private static double getPriceGoods1() {
        System.out.println("Enter the price of this item 1:");
        double priceGood1 = scanner.nextDouble();
        return priceGood1;
    }

    private static int getSalesGoods1() {
        System.out.println("Enter te number of sales 1:");
        int sales1Num = scanner.nextInt();
        return sales1Num;

    }
}
