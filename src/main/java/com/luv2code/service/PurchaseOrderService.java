package com.luv2code.service;

import java.util.List;

import com.luv2code.model.PurchaseOrder;

public interface PurchaseOrderService {
	
public PurchaseOrder getPurchaseById(long id);
	
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	public List<PurchaseOrder> getAllPurchaseOrderByUserId(Long userId);
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder);
}


