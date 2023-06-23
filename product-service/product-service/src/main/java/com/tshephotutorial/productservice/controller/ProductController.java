package com.tshephotutorial.productservice.controller;


import com.tshephotutorial.productservice.dto.ProductRequest;
import com.tshephotutorial.productservice.dto.ProductResponse;
import com.tshephotutorial.productservice.model.Product;
import com.tshephotutorial.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(){
        productService.deleteProduct("648f3960fa422b1438a2fed5");
    }
}
