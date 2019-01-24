package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@ResponseBody
	@RequestMapping("/")
	public String root() {
		System.out.println("######################ROOT#########################");
		return "HELLO ROOT";

		
	}

}
