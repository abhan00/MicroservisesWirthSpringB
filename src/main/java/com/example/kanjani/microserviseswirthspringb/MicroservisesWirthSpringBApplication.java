package com.example.kanjani.microserviseswirthspringb;

import com.example.kanjani.microserviseswirthspringb.repository.ProductRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication//(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@ComponentScan({"com.example.kanjani.microserviseswirthspringb.controller"})
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
public class MicroservisesWirthSpringBApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservisesWirthSpringBApplication.class, args);

    }

}
