package com.course.practicaljava.rest.controller;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	private Logger log = LoggerFactory.getLogger(DefaultRestController.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		log.info("PIPO");
		
		return "Hoi, welcome!!";
	}

	@PostMapping("/welkom")
	public String welkom() {
		return "Hoi, welkom!!";
	}
	
	@GetMapping("/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
