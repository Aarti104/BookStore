package com.cg.bookstore.entity;


import java.time.LocalDate;
import javax.persistence.Embeddable;

@Embeddable
public class Order{

	private String orderId;
	private String userId;
	private String addressId;
	private String orderStatus;
	private LocalDate orderDate;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(String orderId, String userId, String addressId, String orderStatus, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.addressId = addressId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", addressId=" + addressId + ", orderStatus="
				+ orderStatus + ", orderDate=" + orderDate + "]";
	}
	
	

}
