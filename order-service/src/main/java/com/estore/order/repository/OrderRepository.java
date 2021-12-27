package com.estore.order.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.estore.order.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{

	public List<Order> findAll();
	
	@Query(value = "{orderId:'?0'}")
	public Order findOrderByOrderId(long orderId);
	
	public Order insert(Order order);
	
	public Order deleteByOrderId(long id);
	
}
