package com.restful.rest.webservices.restfulwebservices.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
	@Autowired
	private ProductDaoService service;
	
	@GetMapping("/products")
	public List<Product> retrieveAllProducts() {
		return service.findAll();
	}
}
