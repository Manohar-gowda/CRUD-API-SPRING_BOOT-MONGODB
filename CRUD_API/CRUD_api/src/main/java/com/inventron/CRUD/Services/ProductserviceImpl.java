package com.inventron.CRUD.Services;

import com.inventron.CRUD.DTO.Product;
import com.inventron.CRUD.Repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductserviceImpl implements Productservice {
    @Autowired
    Productrepository productrep;

    @Override
    public Product addProduct(Product product) {

        return productrep.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productrep.findAll();
    }

    @Override
    public Optional<Product> getById(String id) {
        if (!productrep.existsById(id)) {
           throw new RuntimeException("Product id not exists");
        }
        return productrep.findById(id) ;
    }

    @Override
    public String deleteById(String id){
        productrep.deleteById(id);

        return "Product is deleted:" +id;
    }

    @Override
    public Optional<Product> findById(String id) {
        return productrep.findById(id);
    }


}
