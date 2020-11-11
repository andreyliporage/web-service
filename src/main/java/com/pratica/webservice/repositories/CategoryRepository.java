package com.pratica.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
