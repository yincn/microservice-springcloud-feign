package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class Result {

	private Integer code = 200;
	private String info;
	private Map<String, Object> data = new HashMap<>();

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	public void add(String key, Object value) {
		this.data.put(key, value);
	}
}
