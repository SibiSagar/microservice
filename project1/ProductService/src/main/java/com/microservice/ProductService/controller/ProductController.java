package com.microservice.ProductService.controller;
import com.microservice.ProductService.entity.Product;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.service.ProductServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/product")
@Log4j2
public class ProductController {
@Autowired
private ProductServiceImpl productServiceImpl;


    @GetMapping
    public ResponseEntity<List<Product>> getProduct(){
        log.info("GET request for 'All products' initiated from the PRODUCT controller ");
        return new ResponseEntity<>(productServiceImpl.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") long id){
        log.info("GET request for 'product ID: {}' initiated from the PRODUCT controller ",id);
        return new ResponseEntity<>(productServiceImpl.findById(id),HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody ProductRequest productRequest){
        log.info("POST request for 'Adding product' initiated from the PRODUCT controller ");
        return new ResponseEntity<>(productServiceImpl.addProduct(productRequest), HttpStatus.OK);

    }

}