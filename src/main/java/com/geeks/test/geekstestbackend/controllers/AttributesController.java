package com.geeks.test.geekstestbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geeks.test.geekstestbackend.models.Attributes;
import com.geeks.test.geekstestbackend.repositories.AttributesRepository;

@RestController
@CrossOrigin("http://localhost:4200")
public class AttributesController {

	@Autowired
	private AttributesRepository attributesRepository;
	
	@RequestMapping(value="/attributes", method=RequestMethod.GET)
	public List<Attributes> getAll() {
		return attributesRepository.findAll().subList(0, 5);
	}
	
	@RequestMapping(value="/attributes/{code}", method=RequestMethod.GET)
	public Attributes get(@PathVariable String code) {
		return attributesRepository.findByCode(code);
	}
	
	@RequestMapping(value="/attributes", method=RequestMethod.POST)
	public void saveAll(@RequestBody List<Attributes> attributes) {
		attributesRepository.saveAll(attributes);
	}
}
