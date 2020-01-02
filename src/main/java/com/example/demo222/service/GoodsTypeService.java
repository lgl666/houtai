package com.example.demo222.service;

import java.util.List;

import com.example.demo222.model.GoodsType;

public interface GoodsTypeService {
	
	public int  goodsType(GoodsType goodsType);
	
	public int deleteGoodsType(GoodsType goodsType);
	
	public int updateGoodsType(GoodsType goodsType);
	
	public List<GoodsType> selectGoodsType();
}
