package com.test.amaro.amarotest.products;

import com.test.amaro.amarotest.BasePresenter;
import com.test.amaro.amarotest.BaseView;
import com.test.amaro.amarotest.model.Product;

import java.util.List;

/**
 * Created by luiszacheu on 11/07/18.
 */
public interface ProductsContract {

    interface View extends BaseView<Presenter>{

        void setLoading(boolean visible);

        void showProducts(List<Product> products);

        void showProductDetail(Product product);


    }

    interface Presenter extends BasePresenter{

        void loadProducts();

        void openProductDetail(Product product);

    }

}
