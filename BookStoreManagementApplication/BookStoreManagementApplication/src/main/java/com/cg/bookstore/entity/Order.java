package com.cg.bookstore.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Order")
@NamedQueries(@NamedQuery(name = "getAllOrder", query = "SELECT order FROM Order order"))
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "orderId")
	private String orderId;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private String userId;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private String addressId;
	@Column(name = "orderStatus")
	private String orderStatus;
	@Column(name = "orderDate")
	private LocalDate orderDate;
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
