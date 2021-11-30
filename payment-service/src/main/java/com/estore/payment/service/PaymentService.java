package com.estore.payment.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estore.payment.entity.DebitCreditDetail;
import com.estore.payment.entity.PaymentOrder;
import com.estore.payment.repository.DebitCreditRepository;
import com.estore.payment.repository.PaymentRepository;

@Service
public class PaymentService {

	
	@Autowired
	PaymentRepository repository;
	
	@Autowired
	DebitCreditRepository debitCreditDetailsRepository;
	
	public PaymentOrder createPaymentOrder(PaymentOrder order) {
		
		Set<DebitCreditDetail> debitCreditDetails = order.getDebitCreditDetails();
		
		PaymentOrder payOrder = order;
		payOrder.setDebitCreditDetails(null);
		
		for(DebitCreditDetail debitCreditDetail : debitCreditDetails) {
			debitCreditDetail.setPaymentOrder(payOrder);
			payOrder = debitCreditDetailsRepository.save(debitCreditDetail).getPaymentOrder();
		}
		
		return order;
	}
	
	public Set<PaymentOrder> findAll2(){
		
		Set<PaymentOrder> findAll = new HashSet<>();
		List<DebitCreditDetail> findAllDebitCreditDetails = debitCreditDetailsRepository.findAll();
		
		for(DebitCreditDetail detail : findAllDebitCreditDetails) {
			PaymentOrder order = detail.getPaymentOrder();
			findAll.add(detail.getPaymentOrder());
		}
		
		return findAll;
	}
	
	public Set<PaymentOrder> findAll(){
		
		Set<PaymentOrder> findAll = repository.findAll();
		
		return findAll;
	}
}
