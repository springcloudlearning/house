package com.ymd.learn.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ymd.learn.house.common.model.User;
import com.ymd.learn.house.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	
}
