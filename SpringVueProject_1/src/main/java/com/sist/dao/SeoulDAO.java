package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.*;
import com.sist.vo.*;
//Vue => Next.js
//React => Next.js
@Repository
public class SeoulDAO {
	@Autowired
	private SeoulMapper mapper;
	/*
	 * @Select("SELECT fno,poster,name,num "
			  +"FROM (SELECT no,poster,title,rownum as num "
			  +"FROM (SELECT no,poster,title "
			  +"FROM ${table_name} ORDER BY no ASC)) "
			  +"WHERE num BETWEEN #{start} AND #{end}")
	   public List<SeoulVO> seoulListData(Map map);
	   @Select("SELECT CEIL(COUNT(*)/12.0) FROM ${table_name}")
	   public int seoulTotalPage();
	 */
	public List<SeoulVO> seoulListData(Map map)
	{
		return mapper.seoulListData(map);
	}
	public int seoulTotalPage(Map map)
	{
		return mapper.seoulTotalPage(map);
	}
	public SeoulVO seoulLocationDetailData(int no)
	{
		return mapper.seoulLocationDetailData(no);
	}
	
}
