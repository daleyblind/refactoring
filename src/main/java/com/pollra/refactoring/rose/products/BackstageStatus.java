package com.pollra.refactoring.rose.products;

import com.pollra.refactoring.rose.Item;

public class BackstageStatus implements ProductStatus {
    @Override
    public void updateStatus(Item item) {
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
        }

        if (item.quality >= 50) return;

        if (item.sellIn < 11) {
            item.quality++;
        }
        if (item.sellIn < 6) {
            item.quality++;
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
