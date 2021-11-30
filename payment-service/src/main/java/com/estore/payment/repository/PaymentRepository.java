package com.estore.payment.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.estore.payment.entity.PaymentOrder;


@Repository
public interface PaymentRepository extends CrudRepository<PaymentOrder, Integer>{
	
	
	public PaymentOrder save(PaymentOrder order);
	
	public Set<PaymentOrder> findAll();

}
