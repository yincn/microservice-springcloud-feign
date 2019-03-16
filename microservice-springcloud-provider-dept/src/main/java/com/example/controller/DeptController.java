package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Result;

@RequestMapping("/dept")
@RestController
public class DeptController {

	@PostMapping("/get/{id}")
	public Result get(@PathVariable("id") Integer id) {
		Result result = new Result();
		
		result.setInfo("您传入的 DeptId 是:" + id);
		
		return result;
	}
	
}
