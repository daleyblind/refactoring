package com.pollra.refactoring.rose;

/**
 * @since       2021.08.27
 * @author      pollra
 * @description item
 **********************************************************************************************************************/
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}