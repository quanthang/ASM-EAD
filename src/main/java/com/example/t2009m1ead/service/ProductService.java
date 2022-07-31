package com.example.t2009m1ead.service;

import com.example.t2009m1ead.entity.Product;
import com.example.t2009m1ead.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}