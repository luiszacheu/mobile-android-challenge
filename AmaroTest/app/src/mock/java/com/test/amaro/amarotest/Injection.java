package com.test.amaro.amarotest;

import com.test.amaro.amarotest.data.FakeProductsRepositoryImpl;
import com.test.amaro.amarotest.data.ProductsRepository;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class Injection {

    public static ProductsRepository provideProductsRepository(){

        return new FakeProductsRepositoryImpl();
    }
}
