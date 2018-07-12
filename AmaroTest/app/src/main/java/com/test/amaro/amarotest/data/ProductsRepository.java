package com.test.amaro.amarotest.data;

import android.support.annotation.NonNull;

import com.test.amaro.amarotest.model.Product;

import java.util.List;

/**
 * Created by luiszacheu on 12/07/18.
 */
public interface ProductsRepository {

    interface LoadProductsCallback{

        void onProductsLoaded(List<Product> products);

        void onProductsLoadedFailed(Throwable throwable);

    }

    void loadProducts(@NonNull final LoadProductsCallback callback);

}
