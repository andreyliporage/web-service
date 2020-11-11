package com.pratica.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratica.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
