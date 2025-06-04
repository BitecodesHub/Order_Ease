package com.OrderEase_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private Long productId;
    private int quantity;
    private double priceAtTimeOfOrder;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPriceAtTimeOfOrder() {
		return priceAtTimeOfOrder;
	}
	public void setPriceAtTimeOfOrder(double priceAtTimeOfOrder) {
		this.priceAtTimeOfOrder = priceAtTimeOfOrder;
	}
	public OrderItem(Long id, Long orderId, Long productId, int quantity, double priceAtTimeOfOrder) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.priceAtTimeOfOrder = priceAtTimeOfOrder;
	}
	public OrderItem() {
	}

    
    
}
