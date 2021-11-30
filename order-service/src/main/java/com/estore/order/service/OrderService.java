package com.estore.order.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estore.order.entity.Order;
import com.estore.order.repository.OrderRepository;
import com.estore.order.util.OrderStatus;

@Service
public class OrderService {

	
	@Autowired
	OrderRepository repo;
	
	public List<Order> findAll(){
		
		return repo.findAll();
	}
	
	public Order createOrder(Order order) {
		
		order.setOrderId(new Random().nextLong());
		order.setStatus(OrderStatus.ACCEPTED);
		Order order2 = repo.save(order);
		return order2;
	}
	
	public Order updateOrder(Order order) {
		
		Order order2 = repo.save(order);
		return order2;
	}
}
