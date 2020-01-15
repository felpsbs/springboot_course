package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
