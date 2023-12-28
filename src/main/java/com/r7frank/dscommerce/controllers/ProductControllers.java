package com.r7frank.dscommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductControllers {

	@GetMapping()
	public String Teste() {
		return "Spring Rest está no ar!";
	}
	
	
}
