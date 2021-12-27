package com.estore.order.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.estore.order.util.OrderStatus;
import lombok.Data;

@Data
@Document("order")
public class Order {

	@MongoId(value = FieldType.INT64)
	private long orderId;
	private long productId;
	private String productName;
	private long price;
	
	private int quantity;
	private OrderStatus status;
}
