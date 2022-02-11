package com.cg.bookstore.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookstore.entity.Order;
import com.cg.bookstore.repository.OrderRepo;
import com.cg.bookstore.repository.OrderRepoImpl;

@Service
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
