package com.sist.spring;


import org.springframework.stereotype.Component;

import lombok.Data;
/*
 *   xml
 *   	application-datasource.xml : DB
 *      application-context.xml : 사용자 정의 클래스 / MVC
 *      applicaton-security.xml : 보안
 * 
 */
@Data
public class Member {
	private int mno; 
	private String name; 
	private String address;


}
