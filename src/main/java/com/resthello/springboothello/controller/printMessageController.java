package com.resthello.springboothello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resthello.springboothello.service.printMessageService;

@RestController

public class printMessageController {
	@Autowired
	printMessageService service;
	@RequestMapping("/hello")
	public String message(){
		String s = null;
		s = service.message();
		return s;
	}

}
