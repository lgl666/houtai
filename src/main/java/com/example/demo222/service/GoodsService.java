package com.example.demo222.service;

import java.io.InputStream;
import java.util.List;

import com.example.demo222.model.Goods;

public interface GoodsService {
	public List<Goods> getGoodsList();
	
	public int createGoods(Goods goods,InputStream fileStream);
	
	public int updateGoods(Goods goods);
	
	public int deleteGoods(Goods goods);
	
}
