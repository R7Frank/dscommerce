package com.r7frank.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r7frank.dscommerce.dto.ProductDTO;
import com.r7frank.dscommerce.entities.Product;
import com.r7frank.dscommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductControllers {

	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		ProductDTO dto = service.findById(id);
		return dto;
	}
	
	
}
