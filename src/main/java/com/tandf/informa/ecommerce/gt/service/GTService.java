package com.tandf.informa.ecommerce.gt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tandf.informa.ecommerce.gt.models.Products;
import com.tandf.informa.ecommerce.gt.repository.ProductRepository;

@Service
public class GTService {

	@Autowired
	private ProductRepository productRepository;

	public List<Products> findAllProducts() {
		List<Products> list = productRepository.findAll();
		return list;
	}

	public Long createProduct(Products p) {
		productRepository.save(p);
		return p.getId();
	}
}
