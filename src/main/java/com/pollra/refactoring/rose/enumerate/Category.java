package com.pollra.refactoring.rose.enumerate;

import com.pollra.refactoring.rose.products.*;

import java.util.Arrays;

public enum Category {
    AGED_BRIE("Aged Brie", new AgedBrieStatus()),
    BACKSTAGE("Backstage passes to a TAFKAL80ETC concert", new BackstageStatus()),
    SULFURAS("Sulfuras, Hand of Ragnaros", new SulfurasStatus()),
    CONJURED("Conjured Mana Cake", new ConjuredStatus()),
    DEFAULT("", new DefaultStatus());

    private final String name;
    private final ProductStatus productStatus;

    Category(String _name, ProductStatus _productStatus) {
        name = _name;
        productStatus = _productStatus;
    }

    public String getName() {
        return name;
    }

    public static ProductStatus getProductStatusByItemName(String itemName) {
        return Arrays.stream(Category.values())
                .filter(v -> v.getName().equals(itemName))
                .findAny()
                .orElse(Category.DEFAULT)
                .productStatus;
    }


}
