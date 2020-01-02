package com.example.demo222.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo222.model.Order;
import com.example.demo222.service.OrderService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/getOrderList")
	public List<Order> getOrderList(){
		return orderService.getOrderList();
	}
	@RequestMapping("/create")
	public JSONObject create(@RequestBody Order order) {
		JSONObject result = new JSONObject();
		int i=orderService.createOrder(order);
		 result.put("state", i);
		return null;
	}
	@RequestMapping("/delete")
	public JSONObject delete(@RequestBody Order order) {
		JSONObject result = new JSONObject();
		int i=orderService.deleteOrder(order);
		 result.put("state", i);
		
		return null;
	}
}
