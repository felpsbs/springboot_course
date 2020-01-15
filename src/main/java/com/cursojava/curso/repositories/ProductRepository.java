package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
