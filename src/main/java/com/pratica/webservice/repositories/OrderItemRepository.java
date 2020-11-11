package com.pratica.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
