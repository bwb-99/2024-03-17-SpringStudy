package com.sist.spring;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String path="C:\\springDev\\2024-03-17-SpringStudy\\SpringDIProject_2\\src\\main\\java\\app.xml";
        ApplicationContext app=
        		new ApplicationContext(path);
        Sawon sa=(Sawon)app.getBean("sa");
        sa.print();
        
	}

}
