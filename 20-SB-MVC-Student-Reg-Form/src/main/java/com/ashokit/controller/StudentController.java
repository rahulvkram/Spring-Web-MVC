package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.bindings.Student;
import com.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/student")
	public String loadForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("genders", service.getGenders());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());
		return "studentReg";
	}

	@PostMapping("/saveStudent")
	public String handleSubmitBtn(Student student, Model model) {
		System.out.println(student);

		model.addAttribute("student", student);

		return "studentData";
	}

}
