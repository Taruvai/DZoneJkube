package com.example.jkube;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	 @Value("${welcome}")
	 private String welcome;

	    @GetMapping("/hello")
	    public String hello() {
	        return welcome;
	    }

}
