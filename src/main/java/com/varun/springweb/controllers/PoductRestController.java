package com.varun.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.varun.springweb.entities.Product;
import com.varun.springweb.repos.ProductRepo;

@RestController
public class PoductRestController {
	
	@Autowired
	ProductRepo repo;
	
	@RequestMapping(value = "/products", method=RequestMethod.GET)
	public List<Product> getProducts(){	
		return repo.findAll();	
	}
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@RequestMapping(value = "/products", method=RequestMethod.POST)
	public Product createProduct(Product product){	
		return repo.save(product);	
	}
	
	@RequestMapping(value = "/products", method=RequestMethod.PUT)
	public Product updateProduct(Product product){	
		return repo.save(product);	
	}
	
	@RequestMapping(value = "/products/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		 repo.deleteById(id);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
