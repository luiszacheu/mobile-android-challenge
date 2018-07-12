package com.test.amaro.amarotest.data;

import android.support.annotation.NonNull;

import com.test.amaro.amarotest.data.remote.ApiClient;
import com.test.amaro.amarotest.data.remote.ProductsResponse;
import com.test.amaro.amarotest.data.remote.ProductsService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class ProductsRepositoryImpl implements ProductsRepository {

    private ProductsService service;

    public ProductsRepositoryImpl() {
        this.service = ApiClient.getRetrofitInstance().create(ProductsService.class);
    }

    @Override
    public void loadProducts(@NonNull final LoadProductsCallback callback) {
        Call<ProductsResponse> productsResponseCall = service.getAllProducts();
        productsResponseCall.enqueue(new Callback<ProductsResponse>() {
            @Override
            public void onResponse(Call<ProductsResponse> call, Response<ProductsResponse> response) {
                callback.onProductsLoaded(response.body().getProducts());
            }

            @Override
            public void onFailure(Call<ProductsResponse> call, Throwable t) {
                callback.onProductsLoadedFailed(t);
            }
        });
    }
}
