package com.softitlan.store.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.softitlan.store.R;
import com.softitlan.store.controller.ProductController;
import com.softitlan.store.model.Product;
import com.squareup.picasso.Picasso;

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
        View view = LayoutInflater.from(this.getContext()).inflate(R.layout.fragment_product_list_row, parent,false);
        TextView titulo = view.findViewById(R.id.txtTitle);
        TextView salePrice=view.findViewById(R.id.txtSalePrice);
        Product product = this.productList.get(position);
        ImageView imageViewMini=view.findViewById(R.id.imageViewMini);
        titulo.setText(product.getTitulo());
        salePrice.setText("$"+product.getSalePrice().toString());
        Picasso.get().load(product.getPicturemini()).into(imageViewMini);
        return view;
    }
}
