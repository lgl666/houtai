package com.example.demo222.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo222.model.GoodsType;



@Mapper
public interface GoodsTypeMapper {

	public GoodsType selectGoodsTypeBytName(String tName);
	
	public int insertGoodsType(GoodsType goodsType);
	
	public int deleteGoodsType(GoodsType goodsType);
	
	public int updateGoodsType(GoodsType goodsType);
	
	public List<GoodsType> selectGoodsType();
}
