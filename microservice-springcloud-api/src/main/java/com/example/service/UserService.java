package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Result;

@FeignClient(value="PROVIDER-USER")
public interface UserService {
	
	@RequestMapping(value="/user/get/{id}",method=RequestMethod.POST)
	public Result get(@PathVariable("id") Integer id);
}
