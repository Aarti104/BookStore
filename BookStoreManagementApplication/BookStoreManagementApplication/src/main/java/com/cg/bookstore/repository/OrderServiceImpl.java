package com.cg.services;

import java.time.LocalDate;
import java.util.List;

import com.cg.entity.Order;
import com.cg.repo.OrderRepo;
import com.cg.repo.OrderRepoImpl;

public class OrderServiceImpl implements OrderService{
	private OrderRepo repo;

	public OrderServiceImpl() {
		repo = new OrderRepoImpl();
	}
	

	@Override
	public Order addOrder(Order order) {
		return repo.addOrder(order);
	}

	@Override
	public Order updateOrder(Order order) {
		return repo.updateOrder(order);
	}

	@Override
	public Order removeOrder(Order order) {
		return repo.removeOrder(order);
	}

	@Override
	public Order viewOrder(Order order) {
		return repo.viewOrder(order);
	}

	@Override
	public List<Order> viewAllOrders(LocalDate date) {
		return repo.viewAllOrders(date);
	}

	@Override
	public List<Order> viewAllOrdersByLocation(String location) {
		return repo.viewAllOrdersByLocation(location);
	}

	@Override
	public List<Order> viewAllOrderByUserId(String userid) {
		return repo.viewAllOrderByUserId(userid);
	}

}
