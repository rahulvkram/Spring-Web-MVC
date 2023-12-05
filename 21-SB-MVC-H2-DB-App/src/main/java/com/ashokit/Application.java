package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Student;
import com.ashokit.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		/*StudentRepository stuRepo = ctxt.getBean(StudentRepository.class);

		Student s = new Student();
		s.setStudentName("Raju");
		s.setStudentRank(100);

		Student save = stuRepo.save(s);
		if (save.getStudentId() != null) {
			System.out.println("Record Saved with ID as :: " + save.getStudentId());
		}*/
	}

}
