package com.example.demo.register.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

//http://localhost:8080/register/sjh/asd	--->restful하게 받기

@ResponseBody
public class GetIDPasswordController {
	
	@GetMapping("/register/{id}/{pw}")
	public LinkedHashMap<String, Object> hi(@PathVariable("id") String id, @PathVariable("pw") String pw) {
		LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();	//순서보장
		LinkedHashMap<String, Object> small_result = new LinkedHashMap<String, Object>();
		//Map<String, Object> result = new HashMap<String, Object>();
		//Map<String, Object> small_result = new HashMap<String, Object>();
		small_result.put("id", id);
		small_result.put("pw", pw);
		String[] arr = {id, pw};
		result.put("id", id);
		result.put("pw", pw);
		result.put("arr", arr);
		result.put("json", small_result);
		//result.put("result", result);
		return result;
	}
}

/*
@RestController

//  http://localhost:8080/register?id=sjh&pw=asd  ---> 쿼리스트링
public class GetIDPasswordController {
	//@GetMapping("/hello")
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String hi(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		return id+" "+pw;
	}
}

*/
