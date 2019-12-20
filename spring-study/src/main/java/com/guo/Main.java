package com.guo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "spring-study/docs/classes");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		UserBean userBean = (UserBean) context.getBean("getUserBean");
//		FactoryBean factoryBean = (FactoryBean) context.getBean("&getUserBean");
//		UserService userService = context.getBean(UserService.class);
//		userService.login();
		context.close();


	}
}
