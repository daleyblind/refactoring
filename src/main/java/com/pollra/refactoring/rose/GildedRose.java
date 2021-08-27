package com.pollra.refactoring.rose;

import com.pollra.refactoring.rose.enumerate.Category;

/**
 * @since       2021.08.27
 * @author      pollra
 * @description gilded rose
 **********************************************************************************************************************/
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ProductStatusUpdateSystem productStatusUpdateSystem = new ProductStatusUpdateSystem();
            productStatusUpdateSystem.setProductStatus(Category.getProductStatusByItemName(item.name));
            productStatusUpdateSystem.updateStatus(item);
        }
    }
}