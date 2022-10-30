package com.java.pManage.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.java.pManage.entity.Discount;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, String>{

}
