package com.cg.bookstore.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import com.cg.bookstore.entity.Order;

@Service
public interface OrderService {
	public Order addOrder(Order order);
	public Order updateOrder(Order order);
	public Order removeOrder(Order order);
	public Order viewOrder(Order order);
	public List<Order> viewAllOrders(LocalDate date);
	public List<Order> viewAllOrdersByLocation(String location);
	public List<Order> viewAllOrderByUserId(String userid);

}
