package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hallo")
	public List<Integer> hello() {
		return getNumber();
	}
	private List<Integer> getNumber(){
		Integer[] week = {1,2343,34,2,44,8,9,0};
		Arrays.sort(week);
		System.out.println("Github commit");
		return Arrays.asList(week);
	}
	
	
	private Map<String, Integer> getMap(){
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("foo", 3);
		return myMap;
	}
	
	@GetMapping("/map")
	public Map<String, Integer> myHashMapMethod(){
		return getMap();
	}
	//test von lokal
	private String messageString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Personalnummer;");
		sb.append("Sozialversicherungsnummer;");
		sb.append("Email");
		return sb.toString();
		
	}
	//test
	@GetMapping("/test")
	public String message() {
		return messageString();
	}
}
