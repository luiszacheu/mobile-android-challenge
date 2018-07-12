package com.test.amaro.amarotest.products;

import com.test.amaro.amarotest.data.ProductsRepository;
import com.test.amaro.amarotest.data.ProductsRepositoryImpl;
import com.test.amaro.amarotest.model.Product;

import java.util.List;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsPresenter implements ProductsContract.Presenter {

    private ProductsContract.View view;
    private ProductsRepositoryImpl repository;

    ProductsPresenter(ProductsContract.View view, ProductsRepositoryImpl repository) {
        this.view = view;
        this.repository = repository;
        view.setPresenter(this);
    }

    @Override
    public void loadProducts() {
        view.setLoading(true);
        repository.loadProducts(new ProductsRepository.LoadProductsCallback() {
            @Override
            public void onProductsLoaded(List<Product> products) {
                view.showProducts(products);
                view.setLoading(false);
            }

            @Override
            public void onProductsLoadedFailed(Throwable throwable) {
                view.setLoading(false);
                view.showErrorLayout();
            }
        });


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
