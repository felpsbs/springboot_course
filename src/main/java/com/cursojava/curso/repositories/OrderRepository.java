package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.Order;

// Long = tipo da chave primária
public interface OrderRepository extends JpaRepository<Order, Long>{

	// essa classe fica responsável por fazer as ações no bd referentes ao User
	// para essa interface, por ela extender essa jpa, não precisa criar uma implementação dela
	// só  de extender já tem um implementação pronta pra ser usada
}
