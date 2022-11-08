package com.example.springbootsearchrestapi.service;

import com.example.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
