package com.test.amaro.amarotest.products;

import com.test.amaro.amarotest.data.ProductsRepository;
import com.test.amaro.amarotest.data.ProductsRepositoryImpl;
import com.test.amaro.amarotest.model.Product;

import java.util.List;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsPresenter implements ProductsContract.Presenter {

    ProductsContract.View view;
    ProductsRepositoryImpl repository;

    ProductsPresenter(ProductsContract.View view, ProductsRepositoryImpl repository) {
        this.view = view;
        this.repository = repository;
        view.setPresenter(this);
    }

    @Override
    public void loadProducts() {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Produto A", "R$ 10,00"));
//        products.add(new Product("Produto B", "R$ 15,00"));
        repository.loadProducts(new ProductsRepository.LoadProductsCallback() {
            @Override
            public void onProductsLoaded(List<Product> products) {
                view.showProducts(products);
            }

            @Override
            public void onProductsLoadedFailed(Throwable throwable) {
                //TODO Implement error
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
