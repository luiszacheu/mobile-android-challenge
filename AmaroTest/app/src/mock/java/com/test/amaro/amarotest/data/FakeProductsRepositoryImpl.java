package com.test.amaro.amarotest.data;

import android.support.annotation.NonNull;

import com.test.amaro.amarotest.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class FakeProductsRepositoryImpl implements ProductsRepository {

    @Override
    public void loadProducts(@NonNull final LoadProductsCallback callback) {
        List<Product> products =  new ArrayList<>();
        products.add(new Product("Produto A",  "R$ 10,00"));
        products.add(new Product("Produto B",  "R$ 15,00"));
        products.add(new Product("Produto C",  "R$ 20,00"));
        products.add(new Product("Produto D",  "R$ 12,00"));
        callback.onProductsLoaded(products);
    }
}
