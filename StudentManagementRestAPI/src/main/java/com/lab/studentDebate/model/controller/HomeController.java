package com.lab.studentDebate.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	//@RequestMapping("/")
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showPage() {
		return "main-menu";
	}
}

