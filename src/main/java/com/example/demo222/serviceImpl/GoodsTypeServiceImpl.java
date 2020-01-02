package com.example.demo222.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo222.mapper.GoodsTypeMapper;
import com.example.demo222.model.GoodsType;
import com.example.demo222.service.GoodsTypeService;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Autowired
	GoodsTypeMapper goodsTypeMapper;	
	
	@Override
	public int goodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		GoodsType gt = goodsTypeMapper.selectGoodsTypeBytName(goodsType.gettName());
		int i = -1;
		if(gt==null) {
			i= goodsTypeMapper.insertGoodsType(goodsType);
		}else {
			i=-1;
		}
		return i;
	}

	@Override
	public int deleteGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		GoodsType gt1 = goodsTypeMapper.selectGoodsTypeBytName(goodsType.gettName());
		int i =-1;
		if(gt1 != null) {
			i=goodsTypeMapper.deleteGoodsType(goodsType);
		}else {
			i= -1;
		}
		
		
		return i;
	}

	@Override
	public int updateGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		GoodsType gt2 = goodsTypeMapper.selectGoodsTypeBytName(goodsType.gettName());
		int i = -1;
		if(gt2 !=null) {
			i=goodsTypeMapper.updateGoodsType(goodsType);
		}else {
			i=-1;
		}
		return i;
	}

	@Override
	public List<GoodsType> selectGoodsType() {
		// TODO Auto-generated method stub
		return goodsTypeMapper.selectGoodsType();
	}


	
}
