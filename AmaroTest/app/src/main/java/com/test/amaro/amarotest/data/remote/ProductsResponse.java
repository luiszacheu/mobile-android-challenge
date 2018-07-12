package com.test.amaro.amarotest.data.remote;

import com.test.amaro.amarotest.model.Product;

import java.util.List;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class ProductsResponse {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
