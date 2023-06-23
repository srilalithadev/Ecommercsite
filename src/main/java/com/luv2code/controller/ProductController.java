package com.luv2code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	}

