package com.pollra.refactoring.rose.products;

import com.pollra.refactoring.rose.Item;

public class AgedBrieStatus implements ProductStatus {
    @Override
    public void updateStatus(Item item) {
        item.sellIn--;
        if (item.quality >= 50) return;

        item.quality++;

        if (item.sellIn >= 0) return;
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
