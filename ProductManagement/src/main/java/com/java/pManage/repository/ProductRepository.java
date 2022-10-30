package com.java.pManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.pManage.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
