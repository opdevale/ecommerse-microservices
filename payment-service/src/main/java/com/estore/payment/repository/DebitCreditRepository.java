package com.estore.payment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.estore.payment.entity.DebitCreditDetail;

@Repository
public interface DebitCreditRepository extends CrudRepository<DebitCreditDetail, Integer>{
	
	public DebitCreditDetail save(DebitCreditDetail order);
	
	public List<DebitCreditDetail> findAll();

}
