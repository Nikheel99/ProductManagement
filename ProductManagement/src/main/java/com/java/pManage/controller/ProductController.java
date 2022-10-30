package com.java.pManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.pManage.entity.Product;
import com.java.pManage.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService pServ;
	@PostMapping(value="/products/add")
	public Product add(@RequestBody Product p) {
		return pServ.addProduct(p);
	}
	@PutMapping(value="/products/update")
	public String update(@RequestBody Product p) {
		return pServ.updateProduct(p);
	}
	@DeleteMapping(value="/products/delete/{id}")
	 public String delete(@PathVariable int id) {
		return pServ.deleteProduct(id);
	}
	@GetMapping(value="/products/get/{id}")
	public ResponseEntity<Object> getProducts(@PathVariable int id){
		
		return pServ.getProducts(id);
		
	}
}
