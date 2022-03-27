package com.TAUchapters.chapter_9a_Inheritance.OptionalTask;

public class WeddingCake extends Cake {

    private String tiers;

    public WeddingCake() {
        super("flavor");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
