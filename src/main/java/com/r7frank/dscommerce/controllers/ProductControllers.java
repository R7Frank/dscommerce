package com.r7frank.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r7frank.dscommerce.entities.Product;
import com.r7frank.dscommerce.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductControllers {

	@Autowired
	private ProductRepository repository;
	
	@GetMapping()
	public String teste() {
		Optional<Product> result = repository.findById(1L);
		Product product = result.get();
		return product.getName();
	}
	
	
}
