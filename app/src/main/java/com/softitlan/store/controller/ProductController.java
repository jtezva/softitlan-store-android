package com.softitlan.store.controller;

import com.softitlan.store.model.Product;
import com.softitlan.store.service.ProductService;
import com.softitlan.store.view.ProductList;
import com.softitlan.store.view.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private ProductList fragment;
    private ProductListAdapter adapter;
    private ProductService service;
    private List<Product> productList;

    public ProductController(ProductList fragment) {
        this.fragment = fragment;
        this.service = new ProductService();
    }

    public void start() {
        System.out.println("Claro que si campeon");
        this.productList = new ArrayList<>();
        this.adapter = new ProductListAdapter(this.fragment.getContext(), this, this.productList);
        this.fragment.setListAdapter(this.adapter);
        List<Product> list = this.service.findByFilters();
        this.productList.clear();
        this.productList.addAll(list);
        this.adapter.notifyDataSetChanged();
    }

    public void onBuscarClic() {
        // search form activity create and navigate
    }
}