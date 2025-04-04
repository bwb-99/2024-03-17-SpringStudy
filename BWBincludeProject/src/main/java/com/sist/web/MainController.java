package com.sist.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.commons.CommonsPagination;
import com.sist.vo.RecipeVO;
import com.sist.vo.Seoul_LocationVO;

@Controller
public class MainController {
	@GetMapping("main/main.do")
	public String main_main(Model model)
	{
		Map map=CommonsPagination.pageConfig(page, 12);
    	List<Seoul_LocationVO> list=service.recipeListData(map);
    	int totalpage=service.recipeTotalPage();
    	int curpage=(int)map.get("curpage");
    	
    	final int BLOCK=10;
    	int startPage=((curpage-1)/BLOCK*BLOCK)+1;
    	int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
    	
    	model.addAttribute("list", list);
    	model.addAttribute("curpage", curpage);
    	model.addAttribute("totalpage", totalpage);
    	model.addAttribute("startPage", startPage);
    	model.addAttribute("endPage", endPage);
    	
		model.addAttribute("main_jsp","../main/home.jsp");
		return "main/main";
	}
}
