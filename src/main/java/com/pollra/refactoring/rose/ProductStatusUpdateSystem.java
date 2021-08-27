package com.pollra.refactoring.rose;

import com.pollra.refactoring.rose.products.DefaultStatus;
import com.pollra.refactoring.rose.products.ProductStatus;

public class ProductStatusUpdateSystem {

    private ProductStatus productStatus;

    public ProductStatusUpdateSystem() {
        this(new DefaultStatus());
    }

    public ProductStatusUpdateSystem(ProductStatus _productStatus) {
        productStatus = _productStatus;
    }

    public void setProductStatus(ProductStatus _productStatus) {
        productStatus = _productStatus;
    }

    public void updateStatus(Item item) {
        productStatus.updateStatus(item);
    }
}
