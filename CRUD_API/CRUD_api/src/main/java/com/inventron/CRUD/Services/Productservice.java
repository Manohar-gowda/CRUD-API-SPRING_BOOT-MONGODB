package com.inventron.CRUD.Services;

import com.inventron.CRUD.DTO.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public interface Productservice {
    public Product addProduct(@RequestBody Product product);
    public List<Product> getAllProduct();

    public Optional<Product> getById(@PathVariable String id);
    public String deleteById(@PathVariable String id);

    Optional<Product> findById(String id);


}