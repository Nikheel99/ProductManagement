package com.java.pManage.response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.java.pManage.entity.Discount;
import com.java.pManage.entity.Product;

public class ClassResponse {
	
	public ResponseEntity<Object> response(Product p,Discount d){
		
	Map<String, Object> m=new LinkedHashMap<String,Object>();
	Map<String, Object> n=new LinkedHashMap<String,Object>();
	double dis=(p.getpPrice())*d.getDis()/100;
	double gst=(p.getpPrice()-dis)*d.getGst()/100;
	double fPrice;
	fPrice=p.getpPrice()-dis+gst+d.getDc();
	try {
		m.put("productId", p.getpId());
		m.put("name", p.getpName());
		m.put("productType", p.getpType());
		m.put("category", p.getpCat());
		m.put("basePrice", p.getpPrice());
		m.put("discount",dis);
		n.put("gst",gst);
		n.put("delivery",d.getDc());
		m.put("charges", n);
		m.put("finalPrice", fPrice);
		
	}
	catch(Exception e) {
		m.put("Invalid", "please verify your inputs");
	}
	return new ResponseEntity<Object>(m,HttpStatus.OK);
	
}
}
