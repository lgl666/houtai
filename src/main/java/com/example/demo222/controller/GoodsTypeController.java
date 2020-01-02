package com.example.demo222.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo222.model.GoodsType;
import com.example.demo222.service.GoodsTypeService;

import net.sf.json.JSONObject;
@RestController

@RequestMapping("/goodsType")
public class GoodsTypeController {
	@Autowired
	GoodsTypeService goodsTypeService;
	
 @RequestMapping("/createType")
 	public  JSONObject createType (@RequestBody GoodsType goodsType) {
	 JSONObject result = new JSONObject();
	 
	 int i = goodsTypeService.goodsType(goodsType);
	 
	 result.put("state", i);
	 return result;
 }
 @RequestMapping("/deleteType")
 	public JSONObject deleteType(@RequestBody GoodsType goodsType) {
	 JSONObject result = new JSONObject();
	 
	 int i = goodsTypeService.deleteGoodsType(goodsType);
	 
	 result.put("state", i);
	 return result;
 }
  @RequestMapping("/updateType")
  public JSONObject updateType (@RequestBody GoodsType goodsType) {
	  JSONObject result = new JSONObject();
	  
	  int i = goodsTypeService.updateGoodsType(goodsType);
	  result.put("state", i);
	  return result;
  }
  @RequestMapping("/selectType")
  public List<GoodsType> selectType(){
	  return goodsTypeService.selectGoodsType();
  }
  
 }
	
	

