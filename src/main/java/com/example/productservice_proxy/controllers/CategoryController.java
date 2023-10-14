package com.example.productservice_proxy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    @GetMapping()
    public String getAllCategories(){
        return "Getting all actegories";
    }

    @GetMapping("/{categoryID}")
    public String getProductsInCategory(@PathVariable("categoryID") long categoryID){
        return "Getting products of category ID: " +categoryID;
    }

}
