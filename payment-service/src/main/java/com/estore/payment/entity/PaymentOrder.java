package com.estore.payment.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payment_order")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PaymentOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private float amount;

	private String payment_type;

	private int transaction_id;

	//@OneToOne(cascade = CascadeType.ALL)
	/*
	 * @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "debit_credit_details_id", insertable = false, updatable =
	 * false) private DebitCreditDetails debitDetails;
	 */

	//bi-directional many-to-one association to PaymentOrder
		@OneToMany(mappedBy="paymentOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JsonManagedReference
		private Set<DebitCreditDetail> debitCreditDetails;

	
	/*
	 * @OneToOne()
	 * 
	 * @JoinColumn(name = "debit-credit-details_id", insertable = false, updatable =
	 * false) private DebitCreditDetails creditDetails;
	 */

}
