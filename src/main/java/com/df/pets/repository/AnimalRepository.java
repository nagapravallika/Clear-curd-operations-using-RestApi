package com.df.pets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.df.pets.model.Animal;

public interface AnimalRepository extends MongoRepository<Animal, String> {

	Animal findByname(String name);

}
