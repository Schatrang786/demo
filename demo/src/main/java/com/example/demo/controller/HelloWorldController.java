package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

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
	
	//test von lokal
	private String messageString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Personalnummer;");
		sb.append("Sozialversicherungsnummer;");
		sb.append("Email");
		return sb.toString();
		
	}
	@GetMapping("/test")
	public String message() {
		return messageString();
	}
}
