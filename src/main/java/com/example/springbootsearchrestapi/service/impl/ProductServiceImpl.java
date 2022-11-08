package com.example.springbootsearchrestapi.service.impl;

import com.example.springbootsearchrestapi.entity.Product;
import com.example.springbootsearchrestapi.repository.ProductRepository;
import com.example.springbootsearchrestapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
