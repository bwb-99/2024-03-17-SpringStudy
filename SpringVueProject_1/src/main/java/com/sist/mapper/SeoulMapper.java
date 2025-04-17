package com.sist.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;

public interface SeoulMapper {
	@Select("SELECT fno,poster,name,num "
			  +"FROM (SELECT no,poster,title,rownum as num "
			  +"FROM (SELECT no,poster,title "
			  +"FROM ${table_name} ORDER BY no ASC)) "
			  +"WHERE num BETWEEN #{start} AND #{end}")
	   public List<SeoulVO> seoulListData(Map map);
	   @Select("SELECT CEIL(COUNT(*)/12.0) FROM ${table_name}")
	   public int seoulTotalPage(Map map);
	   
	   //인근맛집
	   @Select("SELECT fno,poster,name,rownum "
	   		+"FROM (SELECT fno,poster,name "
			+"WHERE address LIKE '%'|#{address}||'%' "
			+ "ORDER BT hit DESC) "
			+ "WHERE rownum<=8")
	   public List<FoodVO> foodRecommandData(String address);
	  
	   @Select("SELECT * FROM seoul_location "
	   		+ "WHERE no=#{no}")
	public SeoulVO seoulLocationDetailData(int no);
}
