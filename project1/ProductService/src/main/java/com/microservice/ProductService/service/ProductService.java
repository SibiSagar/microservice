package com.microservice.ProductService.service;

import com.microservice.ProductService.model.ProductRequest;

public interface ProductService {

    void addProduct(ProductRequest productRequest);
}
