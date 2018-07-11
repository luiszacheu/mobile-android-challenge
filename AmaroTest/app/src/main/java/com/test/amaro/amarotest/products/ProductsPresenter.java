package com.test.amaro.amarotest.products;

import com.test.amaro.amarotest.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsPresenter implements ProductsContract.Presenter {

    ProductsContract.View view;

    ProductsPresenter(ProductsContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void loadProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Produto A", "R$ 10,00"));
        products.add(new Product("Produto B", "R$ 15,00"));

        view.showProducts(products);
    }

    @Override
    public void openProductDetail(Product product) {
        view.showProductDetail(product);
    }

    @Override
    public void start() {
        loadProducts();
    }
}
