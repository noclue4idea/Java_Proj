package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

	@Autowired
	public static Student stud;
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu=(Student) context.getBean("student");
		
		//stu.setName("Saurabh Mishra");
		System.out.println("Getting name from class::"+stu.getName()+" and "+stu.getRollNo());
		
		String str= new String("xyz");
		str.concat("hfhf");
		
		String poi= "abc";
		String xcv="abc";
		xcv= xcv.intern();
		long endTime = System.currentTimeMillis();
		

        System.out.println("Time taken by String class : "+(endTime - startTime)+" ms");
		System.out.println("printing str::"+xcv);
		
		
	}
	
}
