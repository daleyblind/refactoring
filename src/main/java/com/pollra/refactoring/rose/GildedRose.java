package com.pollra.refactoring.rose;

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

            if (item.name.equals("Aged Brie")) {
                item.sellIn--;
                if (item.quality >= 50) continue;

                item.quality++;

                if (item.sellIn >= 0) continue;
                if (item.quality < 50) {
                    item.quality++;
                }
                continue;
            }

            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.sellIn--;
                if (item.quality < 50) {
                    item.quality++;
                }

                if (item.quality >= 50) continue;

                if (item.sellIn < 11) {
                    item.quality++;
                }
                if (item.sellIn < 6) {
                    item.quality++;
                }
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
                continue;
            }

            if (item.name.equals("Sulfuras, Hand of Ragnaros")) continue;

            // 나머지
            item.sellIn--;
            if (item.quality > 0) {
                item.quality--;
            }
            if (item.quality == 0) continue;

            if (item.sellIn < 0) {
                item.quality--;
            }
        }
    }
}