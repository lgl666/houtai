package com.example.demo222.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.Goods;

@Mapper
public interface GoodsMapper {
	public Goods selectGoodsBygdName(String gdName);
	public List<Goods> selectAllGoods();
	public int insertGoods(Goods goods);
	public int updateGoods(Goods goods);
	public int deleteGoods(Goods goods);
}
