package com.guo.bean;


import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void login() {
		System.out.println("user login...");

	}
}
