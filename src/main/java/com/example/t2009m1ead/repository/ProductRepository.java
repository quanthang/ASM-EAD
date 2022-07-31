package com.example.t2009m1ead.repository;

import com.example.t2009m1ead.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}