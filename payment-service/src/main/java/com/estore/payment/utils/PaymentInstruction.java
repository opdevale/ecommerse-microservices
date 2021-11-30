package com.estore.payment.utils;

import lombok.Data;

public enum PaymentInstruction {

	NET_BANKING("This is online banking payment"), 
	UPI("UPI Payment"), 
	CREDIT_CARD("Credit Card Payment"), 
	DEBIT_CARD("and Debit Card Payment"), 
	COD("Cash On Delivery Payment");
	
	PaymentInstruction(String description) {
		this.description = description;
	}

	private String description;
	
	
	
}
