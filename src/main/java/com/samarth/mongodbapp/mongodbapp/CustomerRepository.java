package com.samarth.mongodbapp.mongodbapp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository <Customer,String> {

}
