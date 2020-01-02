package com.example.demo222.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.Order;

@Mapper
public interface OrderMapper {
	
	public List<Order> getOrderList();
	public Order selectOrderBygdId(int gdID);
	public int createOrder (Order order);
	public int deleteOrder (Order order);
}
