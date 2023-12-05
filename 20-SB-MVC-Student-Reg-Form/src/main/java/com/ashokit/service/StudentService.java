package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<String> getGenders() {
		List<String> genders = new ArrayList<String>();
		genders.add("Male");
		genders.add("Fe-Male");
		return genders;
	}

	public List<String> getCourses() {
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("PHP");
		courses.add("Python");
		return courses;
	}

	public List<String> getTimings() {
		List<String> timings = new ArrayList<String>();
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		return timings;
	}

}
