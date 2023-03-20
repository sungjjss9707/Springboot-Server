package com.example.demo.register;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloController {
	@GetMapping("/hello")
	public String hi() {
		return "hi there~";
	}
}
