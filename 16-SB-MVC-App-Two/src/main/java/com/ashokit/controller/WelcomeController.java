package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

	// GET http://localhost:9090/welcome/
	@GetMapping
	public String welcomeMsg(Model model) {
		String msgTxt = "Welcome to Ashok IT School..!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}

	// GET http://localhost:9090/welcome/greet
	@GetMapping("/greet")
	public String greetMsg(Model model) {
		String msgTxt = "Good Morning...!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}

	// POST http://localhost:9090/welcome
	@PostMapping
	public String doWork() {
		return "index";
	}

	// POST http://localhost:9090/welcome/action
	@PostMapping("/action")
	public String doAction() {
		return "index";
	}

}
