package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.SpringMsgGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		SpringMsgGenerator generator =ctx.getBean("smg",SpringMsgGenerator.class);
		String result=generator.showSpringMsg();
		System.out.println(result);
		ctx.close();
	}
	
}
