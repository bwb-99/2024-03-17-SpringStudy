package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FoodDAO {
	@Autowired
	private FoodMapper mapper;
	
	/*
	 * @Select("SELECT fno,poster,name,num "
			+ "FROM (SELECT fno,poster,name,rownum as num "
			+ "FROM (SELECT +INDEX_ASC(project_food pf_fno_pk)fno,poster,name "
			+ "FROM project_food ORDER BY fno ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
			public List<FoodVO> foodListData(@Param("start") int start,
					 @Param("end") int end);
			
			@Select("SELECT CEIL(COUNT(*)/12.0) FROM project_food")
			public int foodTotalPage();
	 */
	public  List<FoodVO> foodListData(int start,int end)
	{
		return mapper.foodListData(start, end);
	}
	public int foodTotalPage()
	{
		return mapper.foodTotalPage();
	}
	/*
	 * @Select("SELECT fno,poster,name,num "
			+ "FROM (SELECT fno,poster,title,rownum as num "
			+ "FROM (SELECT +INDEX_ASC(project_food pf_fno_pk)fno,poster,name "
			+ "FROM project_food WHERE name LIKE '%'||#{fd}||'%')) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
		public List<FoodVO> foodFindListData(Map map);
		
		@Select("SELECT CEIL(COUNT(*)/12.0) FROM project_food "
				+ "WHERE name LIKE '%'||#{fd}'%'")
		public int foodFindTotalPage(String fd);
	 */
	public  List<FoodVO> foodFindListData(Map map)
	{
		return mapper.foodFindListData(map);
	}
	public int foodFindTotalPage(String fd)
	{
		return mapper.foodFindTotalPage(fd);
	}
	/*
	  //상세보기
		@Select("SELECT * FROM project_food "
				+ "WHERE fno=#{fno}")
		public FoodVO foodDetailData(int no);
	 */
	public FoodVO foodDetailData(int fno)
	{
		return mapper.foodDetailData(fno);
	}
}
