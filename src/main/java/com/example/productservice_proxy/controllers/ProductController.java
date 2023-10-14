package com.example.productservice_proxy.controllers;

import com.example.productservice_proxy.dtos.ProductDto;
import com.example.productservice_proxy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//This controller will always answer /products
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    //IProductService productService;

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){

        return "Returning One product with ID "+productId;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productdto){
        return "Adding new product " +productdto;
    }

}
