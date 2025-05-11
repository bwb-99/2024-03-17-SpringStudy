package com.sist.member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sist.sawon.*;
@Component("mem")
//Target(value={type})
/*
 * 		어노테이션 => 구분자
 * 		TYPE => 크래스 구분
 * 		class A
 * 		{	// 변수 구분 => FIELD
 * 			B b;
 * 			public A(){}
 * 			public void setB(B b) {} 
 * 						---------- PARAMETER
 * 		}
 */
public class Member {
	@Autowired // 객체를 찾아서 주소값을 대입 없으면 주소값 = null

	/*
	 *   CONSTRUCTOR,
	 *   METHOD,
	 *   PARAMETER,
	 *   FIELD,
	 *   ANNOTATION_TYPE
	 */

	private Sawon sawon; //sawon의 객체를 찾아서 주소값을 대입
	
	public void setSawon(Sawon sawon) {
		this.sawon = sawon;
	}
	

	public void display()
	{	
		System.out.println("sawon:"+sawon);
		System.out.println("사번:"+sawon.getSabun());
		System.out.println("이름:"+sawon.getName());
	}

}