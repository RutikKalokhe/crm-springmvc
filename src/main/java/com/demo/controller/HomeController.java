package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Amit Pisal
 */


@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return "index";
	}

}
