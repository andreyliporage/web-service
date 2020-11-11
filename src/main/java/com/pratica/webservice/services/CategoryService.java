package com.pratica.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratica.webservice.entities.Category;
import com.pratica.webservice.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository orderRepository;
	
	public List<Category> findll() {
		return orderRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = orderRepository.findById(id);
		return obj.get();
	}
}
