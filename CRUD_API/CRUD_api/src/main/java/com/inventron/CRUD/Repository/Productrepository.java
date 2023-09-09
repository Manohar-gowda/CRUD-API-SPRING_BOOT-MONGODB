package com.inventron.CRUD.Repository;

import com.inventron.CRUD.DTO.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Productrepository extends MongoRepository<Product,String> {
}
