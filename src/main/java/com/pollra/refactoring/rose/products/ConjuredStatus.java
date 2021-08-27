package com.pollra.refactoring.rose.products;

import com.pollra.refactoring.rose.Item;

public class ConjuredStatus implements ProductStatus {
    @Override
    public void updateStatus(Item item) {
        item.sellIn--;
        if (item.quality > 0) {
            item.quality--;
            item.quality--;
        }
        if (item.quality == 0) return;

        if (item.sellIn < 0) {
            item.quality--;
            item.quality--;
        }
    }
}
