package com.pratica.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
