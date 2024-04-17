package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DemoUtil {

	public Object convertObjectToJson(Object model) {
		ObjectMapper Obj = new ObjectMapper();  
		String jsonStr = null;
		try {
			jsonStr = Obj.writeValueAsString(model);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonStr;
	}  
}
