package com.geeks.test.geekstestbackend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geeks.test.geekstestbackend.models.Attributes;

public interface AttributesRepository extends MongoRepository<Attributes, String>{

	public Attributes findByCode(String code);
}
