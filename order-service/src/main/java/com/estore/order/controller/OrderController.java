package com.estore.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estore.order.entity.Order;
import com.estore.order.service.OrderService;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

	@Autowired
	OrderService service;
	
	@PostMapping
	public ResponseEntity<Order> createOrder(@RequestBody Order order){
		
		return new ResponseEntity<Order>(service.createOrder(order), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(service.updateOrder(order), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> findAllOrders(){
		
		List<Order> list = new ArrayList<Order>();
		list = service.findAll();
		return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
	}
}
