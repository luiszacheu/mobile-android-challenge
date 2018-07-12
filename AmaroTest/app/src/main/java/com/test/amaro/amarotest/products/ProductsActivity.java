package com.test.amaro.amarotest.products;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.test.amaro.amarotest.R;
import com.test.amaro.amarotest.data.ProductsRepositoryImpl;
import com.test.amaro.amarotest.util.AndroidUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsActivity extends AppCompatActivity{

    ProductsPresenter presenter;

    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_activity);

        ButterKnife.bind(this);

        // Set up the toolbar.
        setupToolbar();

        ProductsFragment productsFragment = (ProductsFragment) getSupportFragmentManager().findFragmentById(R.id.framelayout_products_fragmentcontainer);

        if (productsFragment == null){
            productsFragment = ProductsFragment.newInstance();
            AndroidUtils.addFragmentToActivity(getSupportFragmentManager(), productsFragment, R.id.framelayout_products_fragmentcontainer);
        }

        presenter = new ProductsPresenter(productsFragment, new ProductsRepositoryImpl());

    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
    }

}
