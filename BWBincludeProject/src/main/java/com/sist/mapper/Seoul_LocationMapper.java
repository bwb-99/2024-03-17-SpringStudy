package com.sist.mapper;
import com.sist.vo.*;
import java.util.*;

import org.apache.ibatis.annotations.Select;
/*  NO         NOT NULL NUMBER         
	TITLE      NOT NULL VARCHAR2(200)  
	POSTER     NOT NULL VARCHAR2(300)  
	MSG        NOT NULL VARCHAR2(4000) 
	ADDRESS    NOT NULL VARCHAR2(300)  
	HIT                 NUMBER         
	LIKECOUNT           NUMBER         
	REPLYCOUNT          NUMBER    
*/
public interface Seoul_LocationMapper {
	@Select("SELECT no,title,poster,msg,address,num"
			+ "FROM(SELECT no,title,poster,msg,address,rownum as num) "
			+ "FROM(SELECT /*+ INDEX_ASC(seoul_location sl_no_pk) */no,title,poster,msg,address "
			+ "FROM seoul_location "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<Seoul_LocationVO> locationListData(Map map);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) "
			+"FROM seoul_location "
			+ "WHERE no")
	public int locationTotalPage();
			

			
}
