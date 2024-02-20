package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

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
		List<Integer> resultList = new ArrayList<>();
		Integer valueInteger;
		for (Integer integer : week) {
			valueInteger = integer;
			resultList.add(valueInteger);
		}
		return resultList;
	}
	
	
	private Map<String, Integer> getMap(){
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Deutschland", +49);
		myMap.put("Pakistan", +92);
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
		 String[] week = {"Monday", "Tuseday", "Wednesday", "Thursday"};
	       
		 StringBuilder result = new StringBuilder();
		 //String value = null;
	        for (String weekdays : week) {
	        	result.append(weekdays).append("<br>");
	        	//System.out.println(weekdays);
	        }

	        return result.toString().trim();
	}
	@GetMapping("/void")
	public void getMessage() {
		StringBuilder result = new StringBuilder();
		result.append("Hallo Hamsa!");
		result.toString();
		message(); 
		//System.out.println("Hallo Hamsa!");
	}
	 @GetMapping("/displayVoid")
	    public void displayMessage(HttpServletResponse response) throws IOException {
	        String message = "Hello, Hamsa!";
	        response.getWriter().write(message);
	        response.getWriter().write(message());
	    }
}
