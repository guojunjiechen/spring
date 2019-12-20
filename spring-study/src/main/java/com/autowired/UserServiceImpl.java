package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserServiceImpl{

	@Autowired()
	private TestService testService;

	public void Test(){
		System.out.println(testService);
	}
}
