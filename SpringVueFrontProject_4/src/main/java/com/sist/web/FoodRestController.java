package com.sist.web;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sist.dao.FoodDAO;
import com.sist.vo.FoodVO;
import com.sist.vo.RecipeVO;

@RestController
public class FoodRestController {
	@Autowired
	private FoodDAO dao;
	
	@GetMapping(value="food/list_vue.do",
			 produces = "text/plain;charset=UTF-8")
			public String list_vue(int page) throws Exception
			{
				int rowSize=12;
				int start=(rowSize*page)-(rowSize-1);
				int end=rowSize*page;
				List<FoodVO> list=dao.foodListData(start, end);
				int totalpage=dao.foodTotalPage();
				
				Map map=new HashMap();
				map.put("list", list);
				map.put("curpage", page);
				map.put("totalpage", totalpage);
				
				ObjectMapper mapper=new ObjectMapper();
				String json=mapper.writeValueAsString(map);
				
				return json;
		
			}
	@GetMapping(value="food/find_vue.do",
			produces="text/plain;charset=UTF-8")
	public String find_vue(int page,String fd)throws Exception
	{
		int rowSize=12;
		int start=(rowSize*page)-(rowSize-1);
		int end=rowSize*page;
		Map map=new HashMap();
		map.put("start",start);
		map.put("end",end);
		map.put("fd", fd);
		List<FoodVO> list=dao.foodFindData(map);
		int totalpage=dao.foodFindTotalPage(fd);
		
		map=new HashMap();
		map.put("curpage", page);
		map.put("totalpage", totalpage);
		map.put("list", list);
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(map);
		return json;
		
	}
	/*
	 * 	params:{
	 * 		no:this.no
	 * 	}
	 */
		@GetMapping(value="food/detail_vue.do",
				produces = "text/plain;charset=UTF-8")
		public String food_detail(int fno) throws Exception
		{
			FoodVO vo=dao.foodDetailData(fno);
			List<String> aList=new ArrayList<String>();
			List<String> iList=new ArrayList<String>();
			
			String[] addresses=vo.getAddress().split("\n");
			for(String a:addresses)
			{
				StringTokenizer st=new StringTokenizer(a,"^");
				aList.add(st.nextToken());
				iList.add(st.nextToken());
			}
			Map map=new HashMap();
			map.put("vo",vo);
			map.put("aList",aList);
			map.put("iList",iList);
			
			ObjectMapper mapper=new ObjectMapper();
			String json=mapper.writeValueAsString(map);
			
			return json;
		}
		
	}

