package com.microservice.ProductService.service;

import com.microservice.ProductService.exception.ProductNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservice.ProductService.entity.Product;
import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product addProduct(ProductRequest productRequest) {
         log.info("POST request for 'Adding product' initiated from the PRODUCT Service ");
    Product product=Product.builder().productName(productRequest.getName())
                    .price(productRequest.getPrice()).quantity(productRequest.getQuantity())
                    .build();

    this.productRepository.save(product);


    return product;
    
    }

    public List<Product> findAll() {
        log.info("POST request for 'find all products' initiated from the PRODUCT Service ");
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        log.info("GET request for 'product ID: {}' initiated from the PRODUCT Service ",id);
        return this.productRepository.findById(id).orElseThrow(()->
                new ProductNotFoundException("The product with id "+id+" Not found ","PRODUCT_NOT_FOUND"));
    }
}
