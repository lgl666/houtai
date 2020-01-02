package com.example.demo222.service;

import java.util.List;

import com.example.demo222.model.Order;

public interface OrderService {
	public List<Order> getOrderList();
	public int createOrder (Order order);
	public int deleteOrder (Order order);
}
