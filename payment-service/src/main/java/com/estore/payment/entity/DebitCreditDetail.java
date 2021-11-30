package com.estore.payment.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "debit_credit_detail")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DebitCreditDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int account_no;

	private String bank_name;

	private String name;

	private String ifsc_code;

	private String type;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="payment_order")
	//@JsonIgnore
	@JsonBackReference
	private PaymentOrder paymentOrder;
	
	/*
	 * //@OneToOne(mappedBy = "debitDetails")
	 * 
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	 * "debitDetails", optional = false) private PaymentOrder paymentOrder;
	 */
	
	
}
