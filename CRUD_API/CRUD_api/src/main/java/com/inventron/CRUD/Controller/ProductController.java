package com.inventron.CRUD.Controller;

import com.inventron.CRUD.DTO.Product;
import com.inventron.CRUD.Services.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Product")
public class
ProductController {
    @Autowired
    Productservice productServices;

    @PostMapping
    public Product addproduct(@RequestBody Product product) {

        return productServices.addProduct(product);
    }

    @GetMapping("/getall")
    public List<Product> getAllProduct() {
        return productServices.getAllProduct();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Product> getById(@PathVariable String id) {
        Product usr = productServices.findById(id)
                .orElseThrow(()->new RuntimeException("User with ID :"+id+" Not Found!"));

        return productServices.getById(id);
    }


    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable String id){
        return productServices.deleteById(id);
    }







    }