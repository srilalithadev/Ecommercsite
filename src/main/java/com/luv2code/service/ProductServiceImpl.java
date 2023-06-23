package com.luv2code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.model.Product;
import com.luv2code.model.ProductCategory;
import com.luv2code.repository.ProductRepository;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService{


	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product getProductById(Long productCode) {
		return productRepository.findById(productCode).get();
	}

	@Override
	public void updateProduct(Product product) {
		if(productRepository.findById(product.getProductCode()).get() != null) {// add conditions if not found
			   productRepository.save(product);
				
			}
	}

	@Override
	public void deleteProduct(Long productCode) {
		 productRepository.deleteById(productCode);
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
		
		
	}

	@Override
	public Product getProductByProductCategory(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		//productRepository.fin
		return null;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

}
