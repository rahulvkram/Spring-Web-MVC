package com.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView displayWelcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Ashok IT...!!");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping(value = { "/greet", "/g1", "/g2" })
	public ModelAndView displayGreet() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Morning..!!");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/date")
	public String displayDate(Model model) {
		model.addAttribute("msg", "Today's Date Is :: " + new Date());
		return "index";
	}
}
