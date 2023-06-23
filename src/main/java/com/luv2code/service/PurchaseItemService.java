package com.luv2code.service;

import java.util.List;

import com.luv2code.model.PurchaseItem;
import com.luv2code.model.PurchaseOrder;
import com.luv2code.model.User;

public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}
