package com.estore.payment.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estore.payment.entity.DebitCreditDetail;
import com.estore.payment.entity.PaymentOrder;
import com.estore.payment.service.PaymentService;

@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@PostMapping
	public ResponseEntity<PaymentOrder> createPaymentOrder(@RequestBody PaymentOrder order){
		
		
		return new ResponseEntity<PaymentOrder>(service.createPaymentOrder(order), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Set<PaymentOrder>> findAll(){
		
		return new ResponseEntity<Set<PaymentOrder>>(service.findAll(), HttpStatus.OK);
	}
	
}
