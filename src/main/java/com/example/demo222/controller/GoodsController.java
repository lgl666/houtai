package com.example.demo222.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo222.model.Goods;
import com.example.demo222.service.GoodsService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	GoodsService  goodsService;
	
	@RequestMapping("/getlist")
	public List<Goods> getlist(){
		return goodsService.getGoodsList();
	}
	@RequestMapping("/createGoods")
	public JSONObject createGoods(Goods goods,MultipartFile file) {
		JSONObject result = new JSONObject();
		goods.setGdImage(file.getOriginalFilename());
		int i =0;
		try {
			i= goodsService.createGoods(goods, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==-1) {
			result.put("fail", -1);
			System.out.println("");
		}else if(i==-2) {
			result.put("fail", -2);
			System.out.println("");
		}else if(i==-3) {
			result.put("fail", -3);
			System.out.println("文件名为空");
		}else {
			result.put("sccess",0);
		}
		
		return result;
	}
	@RequestMapping("/updateGoods")
	public JSONObject updateGoods(Goods goods) {
		JSONObject result = new JSONObject();
		int i=goodsService.updateGoods(goods);
		result.put("state", i);
		 return result;
	}
	 
	@RequestMapping("/deleteGoods")
	public JSONObject deleteGoods(Goods goods) {
		JSONObject result = new JSONObject();
		int i=goodsService.deleteGoods(goods);
		result.put("state", i);
		 return result;
	}
	
}
