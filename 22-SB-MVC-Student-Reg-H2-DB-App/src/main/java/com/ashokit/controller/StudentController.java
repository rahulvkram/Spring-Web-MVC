package com.ashokit.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.bindings.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@ModelAttribute
	public void init(Model model) {
		System.out.println("********************init() method called***********");
		model.addAttribute("genders", service.getGenders());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());
	}

	@GetMapping("/student")
	public String loadForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentReg";
	}

	@PostMapping("/saveStudent")
	public String handleSubmitBtn(@ModelAttribute("student") Student student, Model model) {
		System.out.println(student);
		model.addAttribute("Seltimings", Arrays.toString(student.getTimings()));
		//model.addAttribute("student", student);
		return "studentReg";
	}

}
