package com.microservice.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.ProductService.entity.Product;
import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(ProductRequest productRequest) {
    
    Product product=Product.builder().productName(productRequest.getName())
                    .price(productRequest.getPrice()).quantity(productRequest.getQuantity())
                    .build();

    this.productRepository.save(product);
    
    }

}
