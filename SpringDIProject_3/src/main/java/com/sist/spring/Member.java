package com.sist.spring;


import org.springframework.stereotype.Component;

import lombok.Data;
/*
 *   xml
 *   	application-datasource.xml : DB
 *      application-context.xml : ����� ���� Ŭ���� / MVC
 *      applicaton-security.xml : ����
 * 
 */
@Data
public class Member {
	private int mno; 
	private String name; 
	private String address;


}
