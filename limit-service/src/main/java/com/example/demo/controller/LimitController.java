package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LimitConfiguration;

@RestController
public class LimitController {
	
	@Autowired
	private Environment env;
	@GetMapping("/limit")
	public LimitConfiguration retriveLimitFromConfiguration() {
		return new LimitConfiguration(Integer.valueOf(env.getProperty("maximum")),Integer.valueOf(env.getProperty("minimum")),env.getProperty("environment"));
	}
}
