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
		
		List<Order> orders = repo.findAll();
		return orders;
	}
	
	public Order createOrder(Order order) {
		
		order.setOrderId(getRandomNumber());
		order.setStatus(OrderStatus.ACCEPTED);
		Order order2 = repo.insert(order);
		return order2;
	}
	
	public Order updateOrder(Order order) {
		
		Order order2 = repo.save(order);
		return order2;
	}
	
	public void deleteOrder(long id) {
		repo.deleteByOrderId(id);
	}
	
	private long getRandomNumber() {
		long min = 1000000000L;
		long max = 9999999999L;

		Random random = new Random();
		return random.nextLong() % (max - min) + max;

	}
}
