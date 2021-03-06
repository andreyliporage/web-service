package com.pratica.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratica.webservice.entities.Product;
import com.pratica.webservice.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository orderRepository;
	
	public List<Product> findll() {
		return orderRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = orderRepository.findById(id);
		return obj.get();
	}
}
