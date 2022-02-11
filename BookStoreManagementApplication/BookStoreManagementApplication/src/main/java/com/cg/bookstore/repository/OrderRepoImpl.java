package com.cg.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Address;
import com.cg.entity.Book;
import com.cg.entity.Order;

public class OrderRepoImpl implements OrderRepo {
	private EntityManager entityManager;

	public OrderRepoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Order addOrder(Order order) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(order);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {order = null;}
		return order;
	}

	@Override
	public Order updateOrder(Order order) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(order);
			entityManager.getTransaction().commit();
		}catch(Exception ex) {order = null;}
		return order;
	}

	@Override
	public Order removeOrder(Order order) {
		Order ord = null;
		try {
			entityManager.getTransaction().begin();
			ord = entityManager.find(Order.class, order);
			if(ord != null)
				entityManager.remove(ord);
			entityManager.getTransaction().commit();
		}catch(Exception ex) { order = null;}finally {
			if(entityManager != null )entityManager.close();
		}
		return order;
	}

	@Override
	public Order viewOrder(Order order) {
		Order ord = entityManager.find(Order.class, order);
		return ord;
	}

	@Override
	public List<Order> viewAllOrders(LocalDate date) {
		Query query = entityManager.createNamedQuery("getAllOrders");
		@SuppressWarnings("unchecked")
		List<Order> orderList = query.getResultList();
		return orderList;
	}

	@Override
	public List<Order> viewAllOrdersByLocation(String location) {
		String qStr = "SELECT order FROM Order order WHERE order.location = :location";
		TypedQuery<Order> query = entityManager.createQuery(qStr, Order.class);
		query.setParameter("location", location);
		List<Order> orderList = query.getResultList();
		return orderList;
	}

	@Override
	public List<Order> viewAllOrderByUserId(String userid) {
		String qStr = "SELECT order FROM Order order WHERE order.userId = :userId";
		TypedQuery<Order> query = entityManager.createQuery(qStr, Order.class);
		query.setParameter("userId", userid);
		List<Order> orderList = query.getResultList();
		return orderList;
	}

}
