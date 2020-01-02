package com.example.demo222.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo222.mapper.GoodsMapper;
import com.example.demo222.model.Goods;
import com.example.demo222.service.GoodsService;

@Service

public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsMapper  goodsMapper;

	
	@Override
	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		return goodsMapper.selectAllGoods();
	}


	@Override
	public int createGoods(Goods goods, InputStream fileStream) {
		// TODO Auto-generated method stub
		String path ="D:\\localFiles\\";
		int i =-1;
		byte[]bs = new byte[1024];
		//读取数据长度
		int len;
			//输出的文件流保存到本地文件
		try {
			File tempFile = new File(path);
			if(!tempFile.exists()) {
				tempFile.mkdir();
			}
			goods.getGdImage();
			Date today= new Date();
			String fileName = today.getTime()+goods.getGdImage();
			goods.setGdImage("/Images/"+fileName);
			OutputStream gd = new FileOutputStream(tempFile.getPath()+ File.separator +fileName);
			//开始读取
			while((len = fileStream.read(bs))!= -1) {
				gd.write(bs,0,len);
			}
			}catch(Exception e) {
				e.printStackTrace();
				i= -2;
			}
		if(goods.getGdImage().equals("")) {
			i=-3;
		}else {
			//调用mapper  将goods存入数据库
			goodsMapper.insertGoods(goods);
		}
			
		return 0;
		
	}

	@Override
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub

		Goods gd1 =goodsMapper.selectGoodsBygdName(goods.getGdName());
		
		int i=-1;
		if(gd1 != null) {
			i=goodsMapper.updateGoods(goods);
		}else {
			i=-1;
		}
			
			return i;
		
	}


	@Override
	public int deleteGoods(Goods goods) {
		// TODO Auto-generated method stub

		Goods gd2 =goodsMapper.selectGoodsBygdName(goods.getGdName());
		
		int i=-1;
		if(gd2 != null) {
			i=goodsMapper.deleteGoods(goods);
		}else {
			i=-1;
		}
			
			return i;
		
		
	}


	

}
