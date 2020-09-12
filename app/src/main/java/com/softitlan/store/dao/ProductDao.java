package com.softitlan.store.dao;

import com.softitlan.store.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDao{

    public List<Product> findByFilters() {
        List<Product> list = new ArrayList<>();
        Product a = new Product();
        a.setTitulo("USB kira");
        a.setPicturemini("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSigy1rgQM47pV6LyrgSGqexi56X4FLswfGd6MSSF33szGlObdB3pNUOWxQxNbU-x5gDKH7JA&usqp=CAc");
        a.setSalePrice(125.5);
        list.add(a);

        Product b = new Product();
        b.setTitulo("Nintendo Kart Augmented Reality");
        b.setPicturemini("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS94bCr-NuCQT_3cQ9xbJnCfAUweYjtiIavDg&usqp=CAU");
        b.setSalePrice(125.5);
        list.add(b);

        return list;
    }
}