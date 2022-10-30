package com.java.pManage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.pManage.entity.Discount;
import com.java.pManage.entity.Product;
import com.java.pManage.repository.DiscountRepository;
import com.java.pManage.repository.ProductRepository;
import com.java.pManage.response.ClassResponse;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pRep;
	@Autowired
	private DiscountRepository dRep;
	
	public Product addProduct(Product p) {
		
		return pRep.save(p);
	}
	public String updateProduct(Product p) {
		
		if(pRep.existsById(p.getpId())) {
			
			pRep.save(p);
			return "Product updated successfully";
		}
		else {
			return "Product not found";
		}
	}
	public String deleteProduct(int id) {
		
		if(pRep.existsById(id)) {
			
			pRep.deleteById(id);
			return "Product deleted successfully";
		}
		else {
			return "Product not found";
		}
	}
	public ResponseEntity<Object> getProducts(int pId) {	
	
		Product pt=pRep.getReferenceById(pId);
		Discount ds=dRep.getReferenceById(pt.getpCat());
		ClassResponse cr=new ClassResponse();
		return cr.response(pt, ds);
		
		
		
	}
	

}
