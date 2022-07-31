package com.example.t2009m1ead.service;
import com.example.t2009m1ead.entity.Sale;
import com.example.t2009m1ead.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }
}