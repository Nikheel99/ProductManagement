package com.java.pManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.pManage.entity.Discount;
import com.java.pManage.service.DiscountService;

@RestController
public class DiscountController {

	@Autowired
	DiscountService dServ;
	@PostMapping(value="/discount/add")
	public Discount add(@RequestBody Discount d) {
		return dServ.addProduct(d);
	}
	@PutMapping(value="/discount/update")
	public String update(@RequestBody Discount d) {
		return dServ.updateProduct(d);
	}
	@DeleteMapping(value="/discount/delete/{id}")
	 public String delete(@PathVariable String id) {
		return dServ.deleteProduct(id);
	}
	@GetMapping(value="/discount/getAll")
	public List<Discount> getAll(){
		
		return dServ.getProducts();
	}
	
}
