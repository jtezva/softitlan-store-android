package com.softitlan.store.service;

import com.softitlan.store.dao.ProductDao;
import com.softitlan.store.model.Product;

import java.util.List;

public class ProductService {

    private ProductDao productDao;

    public ProductService(){
        this.productDao = new ProductDao();
    }

    public List<Product> findByFilters() {
        return this.productDao.findByFilters();
    }
}