package com.test.amaro.amarotest.data.remote;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by luiszacheu on 12/07/18.
 */
public interface ProductsService {

    @GET("v2/59b6a65a0f0000e90471257d")
    Call<ProductsResponse> getAllProducts();
}
