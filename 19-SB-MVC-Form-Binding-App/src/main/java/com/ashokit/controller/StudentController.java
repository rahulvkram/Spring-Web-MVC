package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.bindings.Student;

@Controller
public class StudentController {

	@GetMapping("/student")
	public String loadForm(Model model) {

		Student sobj = new Student();

		model.addAttribute("student", sobj);

		return "index";
	}
	
	@PostMapping("/saveStudent")
	public String handleRegBtn(Student student, Model model) {
		
		System.out.println(student);
		
		model.addAttribute("succMsg", "Student Registered...!!");
		
		return "index";
	}

}
