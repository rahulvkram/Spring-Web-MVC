package com.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/date")
public class DateController {

	@GetMapping
	public String dateDisplay(Model model) {
		String msgTxt = "Today's Date Is :: " + new Date();
		model.addAttribute("msg", msgTxt);
		return "index";
	}
}
