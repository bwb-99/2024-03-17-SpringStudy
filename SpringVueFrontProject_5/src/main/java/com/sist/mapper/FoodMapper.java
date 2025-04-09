package com.sist.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.FoodVO;


public interface FoodMapper {
	/*
	 *   // $ => 일반 문자열을 사용할 수 없다 
   *   @Select("SELECT fno,name,poster,num "
		 +"FROM (SELECT fno,name,poster,rownum as num "
		 +"FROM (SELECT fno,name,poster "
		 +"FROM project_food "
		 +"WHERE type LIKE '%'||#{type}||'%' " 
		 +"ORDER BY fno ASC)) "
		 
		 +"WHERE num BETWEEN #{start} AND #{end}")
	  public List<FoodVO> foodListData(Map map);
	  // where 문장으로 변경 
	  
	  @Select("SELECT CEIL(COUNT(*)/12.0) "
			 +"FROM project_food "
			 +"WHERE type LIKE '%'||#{type}||'%')
	  public int foodTotalPage(Map map);
  // $ => 일반 문자열을 사용할 수 없다 
   */

	@Select("SELECT fno,name,poster,num "
			 +"FROM (SELECT fno,name,poster,rownum as num "
			 +"FROM (SELECT fno,name,poster "
			 +"FROM seoul_food "
			 +"WHERE type LIKE '%'||#{type}||'%' " 
			 +"ORDER BY fno ASC)) "
			 +"WHERE num BETWEEN #{start} AND #{end}")
    public List<FoodVO> foodListData(Map map);
		  // where 문장으로 변경 
		  
	@Select("SELECT CEIL(COUNT(*)/12.0) "
		   +"FROM seoul_food "
		   +"WHERE type LIKE '%'||#{type}||'%'")
	public int foodTotalPage(Map map);
	
	@Select("SELECT * FROM seoul_food "
			+"WHERE fno=#{fno}")
	public FoodVO foodDetailData(int fno);

}
