package com.test.amaro.amarotest;

import com.test.amaro.amarotest.data.ProductsRepository;
import com.test.amaro.amarotest.data.ProductsRepositoryImpl;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class Injection {

    public static ProductsRepository provideProductsRepository(){

        return new ProductsRepositoryImpl();
    }
}
