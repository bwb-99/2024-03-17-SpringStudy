package com.sist.web;

import org.springframework.web.bind.annotation.GetMapping;

public class FoodController {
	@GetMapping("food/list.do")
	public String food_list()
	{
		return "food/list";
	}
	@GetMapping("food/detal.do")
	public String food_detail()
	{
		return "food/detail";
	}
}
