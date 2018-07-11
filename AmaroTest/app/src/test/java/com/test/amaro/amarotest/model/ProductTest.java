package com.test.amaro.amarotest.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductTest {



    @Test
    public void giveStringPrice_shouldConvertToCents(){
        Product product;

        product = new Product("Roupa teste A", "R$ 10,00");

        assertThat(product.getActualPriceCents(), instanceOf(Integer.class));

    }
}
