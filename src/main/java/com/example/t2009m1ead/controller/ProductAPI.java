package com.example.t2009m1ead.controller;

import com.example.t2009m1ead.entity.Product;
import com.example.t2009m1ead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductAPI {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }
}