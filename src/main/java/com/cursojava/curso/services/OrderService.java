package com.cursojava.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.curso.entities.Order;
import com.cursojava.curso.repositories.OrderRepository;

// essa tag serve para registrar nossa classe no spring, como um serviço
// para que o @Autowired funcione
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository userRepository;

	public List<Order> findAll() {
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = userRepository.findById(id);
		return obj.get();
	}
}
