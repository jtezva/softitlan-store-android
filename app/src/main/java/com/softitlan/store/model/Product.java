package com.softitlan.store.model;

public class Product {

    private Integer id;
    private String titulo;
    private String picturemini;
    private Double salePrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPicturemini() {
        return picturemini;
    }

    public void setPicturemini(String picturemini) {
        this.picturemini = picturemini;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
}