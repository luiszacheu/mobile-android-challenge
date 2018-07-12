package com.test.amaro.amarotest.products;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.request.target.Target;
import com.test.amaro.amarotest.R;
import com.test.amaro.amarotest.model.Product;
import com.test.amaro.amarotest.util.GlideApp;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    private List<Product> products;

    private ProductListener productListener;

    ProductsAdapter(List<Product> products, ProductListener listener) {
        this.products = products;
        this.productListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.products_adapter, parent, false);

        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Product product =  products.get(position);
            GlideApp.with(holder.parent.getContext())
                    .load(product.getImage())
                    .error(new ColorDrawable(Color.GRAY))
                    .override(400, Target.SIZE_ORIGINAL)
                    .into(holder.image);

        holder.name.setText(product.getName());
        holder.price.setText(product.getActualPrice());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productListener.onClickListener(product);
            }
        });
    }

    @Override
    public void onViewRecycled(@NonNull ViewHolder holder) {
        super.onViewRecycled(holder);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.imageView_image)
        ImageView image;

        @BindView(R.id.textView_name)
        TextView name;

        @BindView(R.id.textView_price)
        TextView price;

        @BindView(R.id.product_adapter_parent)
        ConstraintLayout parent;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }

    interface ProductListener{
        void onClickListener(Product product);
    }
}
