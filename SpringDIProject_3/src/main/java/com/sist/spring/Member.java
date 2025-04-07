package com.sist.spring;


import org.springframework.stereotype.Component;

import lombok.Data;
/*
 *   xml
 *   	application-datasource.xml : DB
 *      application-context.xml : 스프링빈 설정  / MVC
 *      applicaton-security.xml : 보안(Security)
 * 
 */
@Data
public class Member {
	private int mno; 
	private String name; 
	private String address;


}
