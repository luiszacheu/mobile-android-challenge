package com.test.amaro.amarotest.products;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.test.amaro.amarotest.R;
import com.test.amaro.amarotest.model.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsFragment extends Fragment implements ProductsContract.View {

    private static final int COLUMNS_NUMBER = 2;

    @BindView(R.id.recyclerview_products)
    RecyclerView recyclerView;

    private ProductsContract.Presenter presenter;

    private ProductsAdapter adapter;


    public ProductsFragment() {

    }

    public static ProductsFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ProductsFragment fragment = new ProductsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.products_fragment, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.start();
    }

    @Override
    public void setLoading(boolean visible) {

    }

    @Override
    public void showProducts(List<Product> products) {
        adapter = new ProductsAdapter(products, productListener);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), COLUMNS_NUMBER));
    }


    @Override
    public void showProductDetail(Product product) {
        Toast.makeText(getContext(), product.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(ProductsContract.Presenter presenter) {
        this.presenter = presenter;
    }

    ProductsAdapter.ProductListener productListener = new ProductsAdapter.ProductListener() {
        @Override
        public void onClickListener(Product product) {
            presenter.openProductDetail(product);
        }
    };
}
