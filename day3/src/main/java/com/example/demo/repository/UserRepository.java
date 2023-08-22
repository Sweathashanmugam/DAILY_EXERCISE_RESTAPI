package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	boolean existsByEmail(String email);
	Optional<User>findById(Long id);
	Optional<User>deleteById(Long id);


}