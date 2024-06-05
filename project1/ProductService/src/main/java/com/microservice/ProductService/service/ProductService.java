package com.microservice.ProductService.service;

import com.microservice.ProductService.entity.Product;
import com.microservice.ProductService.model.ProductRequest;

public interface ProductService {

    Product addProduct(ProductRequest productRequest);


}
