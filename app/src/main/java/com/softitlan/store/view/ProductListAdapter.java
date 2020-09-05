package com.softitlan.store.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.softitlan.store.R;
import com.softitlan.store.controller.ProductController;
import com.softitlan.store.model.Product;

import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private ProductController controller;
    private List<Product> productList;

    public ProductListAdapter(@NonNull Context context, ProductController controller, List<Product> productList) {
        super(context, 0 , productList);
        this.controller = controller;
        this.productList = productList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(this.getContext())
                .inflate(R.layout.fragment_product_list_row, parent,false);

        TextView titulo = view.findViewById(R.id.product_row_field);
        Product product = this.productList.get(position);

        titulo.setText(product.getTitulo());

        return view;
    }
}
