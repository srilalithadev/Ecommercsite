package com.luv2code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.model.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
}
