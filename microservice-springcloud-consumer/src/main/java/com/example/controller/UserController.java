package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Result;
import com.example.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/get")
	public Result get(HttpServletRequest request) {
		String id = request.getParameter("id");
		if (StringUtils.isEmpty(id)) {
			id = "0";
		}
		
		return userService.get(Integer.valueOf(id));
	}
}
