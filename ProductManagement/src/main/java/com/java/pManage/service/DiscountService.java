package com.java.pManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.pManage.entity.Discount;
import com.java.pManage.repository.DiscountRepository;


@Service
public class DiscountService {
	
	@Autowired
	private DiscountRepository dRep;
	
	public Discount addProduct(Discount d) {
		
		return dRep.save(d);
	}
	public String updateProduct(Discount d) {
		
		if(dRep.existsById(d.getpCat())) {
			
			dRep.save(d);
			return "Product updated successfully";
		}
		else {
			return "Product not found";
		}
	}
	public String deleteProduct(String id) {
		
		if(dRep.existsById(id)) {
			
			dRep.deleteById(id);
			return "Product deleted successfully";
		}
		else {
			return "Product not found";
		}
	}
	public List<Discount> getProducts() {
		
		return dRep.findAll();
	}
}
