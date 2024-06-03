package com.microservice.ProductService.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.ProductService.model.ProductRequest;
import com.microservice.ProductService.service.ProductServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/product")
public class ProductController {
    

@Autowired
private ProductServiceImpl productServiceImpl;

@PostMapping
public String getMethodName(@RequestParam String param) {
    return new String();
}

public long addProduct(ProductRequest productRequest){

    productServiceImpl.addProduct(productRequest);


    return 1;
}

}
