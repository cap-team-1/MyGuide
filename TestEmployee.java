package com.mirza.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mirza.classes.Employee;

public class TestEmployee {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("index.xml");
	con.getBean("empservice");
	
}
}
