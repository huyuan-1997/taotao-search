package com.taotao.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.search.service.ItemService;

@Controller
@RequestMapping("/manager")
public class ItemController {
	@Autowired
	private ItemService itemService;
	/**
	 * 将数据库中的商品导入到索引库中，每一个的导入都会进行覆盖，而不是追加
	 */
	@RequestMapping("/importall")
	@ResponseBody
	public TaotaoResult importAllItems(){
		TaotaoResult result = itemService.importAllItems();
		return result;
	}
}
