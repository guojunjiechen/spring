package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring依赖注入
 * 1. 依赖注入的方式有两种，第一种：setter，第二种：构造器 其他都是这两种的变种
 * 2. @Autowired 不属于自动注入。先根据类型去找实例，如果有两个相同类型的实例，根据名字去找，找到唯一符合条件的，否则报错。
 */
public class Main {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("a");
	}
}
