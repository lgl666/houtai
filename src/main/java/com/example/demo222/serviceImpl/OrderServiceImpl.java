package com.example.demo222.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo222.mapper.OrderMapper;
import com.example.demo222.model.Order;
import com.example.demo222.service.OrderService;

@Service
public class OrderServiceImpl  implements OrderService{

	@Autowired
	OrderMapper orderMapper;
	@Override
	public List<Order> getOrderList() {
		// TODO Auto-generated method stub
		return orderMapper.getOrderList();
	}
	@Override
	public int createOrder(Order order) {
		// TODO Auto-generated method stub
		Order od =orderMapper.selectOrderBygdId(order.getGdID());
		int i= -1;
		if(od==null) {
			i=orderMapper.createOrder(order);
		}else {
			i=-2;
		}
		return i;
	}
	@Override
	public int deleteOrder(Order order) {
		// TODO Auto-generated method stub
		Order od =orderMapper.selectOrderBygdId(order.getGdID());
		int i= -1;
		if(od!=null) {
			i=orderMapper.deleteOrder(order);
		}else {
			i=-2;
		}
		return i;
	}

}
