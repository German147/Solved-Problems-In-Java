package com.TAUchapters.chapter_9a_Inheritance.OptionalTask;

public class TasteTester {
    public static void main(String[] args) {
        birthdayCake();
        weddingCake();
    }

    private static void weddingCake() {
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(1758);
        weddingCake.setTiers("six tiers");
        System.out.println("The Wedding cake price is $ " + weddingCake.getPrice() +
                " and is made of " + weddingCake.getFlavor() + " and it contains " + weddingCake.getTiers());
    }

    private static void birthdayCake() {
        BirthdayCake birthCake = new BirthdayCake();
        birthCake.setPrice(750);
        System.out.println("The birthday cake price is $ " + birthCake.getPrice() + " and is " +
                "made of " + birthCake.getFlavor());
    }
}
/*   public static void main(String[] args){

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }*/