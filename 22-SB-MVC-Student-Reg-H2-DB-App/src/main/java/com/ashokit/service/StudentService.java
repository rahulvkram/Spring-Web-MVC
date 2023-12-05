package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.repository.CourseTimingsRepository;
import com.ashokit.repository.CoursesRepository;
import com.ashokit.repository.GendersRepository;

@Service
public class StudentService {

	@Autowired
	private GendersRepository gendersRepo;

	@Autowired
	private CoursesRepository coursesRepo;

	@Autowired
	private CourseTimingsRepository courseTimingsRepo;

	public List<String> getGenders() {
		/*List<GenderDtlsEntity> findAll = gendersRepo.findAll();
		
		List<String> genders = new ArrayList<>();
		findAll.forEach(entity -> {
			genders.add(entity.getGenderTxt());
		});
		
		return genders;*/
		
		return gendersRepo.getGenders();
	}

	public List<String> getCourses() {
		return coursesRepo.getCourses();
	}

	public List<String> getTimings() {
		return courseTimingsRepo.getTimes();
	}

}
