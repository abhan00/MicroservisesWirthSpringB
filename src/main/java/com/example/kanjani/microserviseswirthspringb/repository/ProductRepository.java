package com.example.kanjani.microserviseswirthspringb.repository;

import com.example.kanjani.microserviseswirthspringb.model.Product;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
