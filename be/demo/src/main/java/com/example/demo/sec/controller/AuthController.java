package com.example.demo.sec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@GetMapping("/insertMany")
	public Map<String, Object> insertMany(){
		System.out.println("insertMany 들어");
		Map<String, Object> map = new HashMap<>();
		map.put("message", "SUCCESSS");
		return map;
	}
}
