package com.luv2code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.luv2code.model.PurchaseItem;
import com.luv2code.model.PurchaseOrder;
import com.luv2code.model.User;
import com.luv2code.repository.PurchaseItemRepository;

@Service(value = "purchaseItemService")
public class PurchaseItemServiceImpl implements PurchaseItemService {
	
	@Autowired
	PurchaseItemRepository purchaseItemRepository;
	

	@Override
	public PurchaseItem getPurchaseItemById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem) {
		
		purchaseItemRepository.save(purchaseItem);
		return purchaseItem;
	}

	@Override
	public List<PurchaseItem> getAllPurchaseItemList() {
		return purchaseItemRepository.findAll(Sort.by(Sort.Direction.ASC, "purchaseOrder_ID"));
		
		
	}

}
