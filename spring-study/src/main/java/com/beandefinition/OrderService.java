package com.beandefinition;

public class OrderService {

	private OrderDao orderDao;

	public void setDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}


	public void init() {
		System.out.println("OrderService init...");
	}

	public void query() {
		orderDao.query();
	}
}
