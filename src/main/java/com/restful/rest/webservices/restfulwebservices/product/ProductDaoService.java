package com.restful.rest.webservices.restfulwebservices.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoService {
	private static List<Product> products = new ArrayList<>();
	private static int productsCount = 3;
	static {
		products.add(new Product(1, "active", new Date(), new Date()));
		products.add(new Product(2, "inactive", new Date(), new Date()));
		products.add(new Product(3, "provisional", new Date(), new Date()));
	}

	public List<Product> findAll() {
		return products;
	}

	public Product save(Product product) {
		if (product.getId() == null) {
			product.setId(++productsCount);
		}
		products.add(product);
		return product;
	}

	public Product findOne(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}
}
