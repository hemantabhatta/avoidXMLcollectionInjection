package com.my.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.beans.Product;
import com.my.config.AppConfig;

public class TestClient {
	
	public static void main(String[] args) {
		ApplicationContext ctx =null;
		Product p=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		p=ctx.getBean("pinfo", Product.class);
		
		System.out.println(p);
		System.out.println(p.getData());
		System.out.println(p.getModes());
		System.out.println(p.getModels());
		System.out.println(p.getContext());
	}
}


