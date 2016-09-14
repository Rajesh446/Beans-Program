package com.beans.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      Messsage objA = (Messsage) context.getBean("helloWorld");
	      objA.setMessage("I'm an java object");
	      objA.getMessage();

	      Message objB = (Message) context.getBean("hello");
	      objB.setname("consists of methods and class");
	      objB.getName();
	      
	      Message objc = (Message) context.getBean("hi");
	      objB.setname("exbhit many properties");
	      objB.getName();
	   }
}
	

