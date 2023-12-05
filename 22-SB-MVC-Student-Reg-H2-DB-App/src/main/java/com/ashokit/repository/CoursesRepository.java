package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entities.CourseDtlsEntity;

public interface CoursesRepository extends JpaRepository<CourseDtlsEntity, Serializable> {

	@Query("select courseName from CourseDtlsEntity")
	public List<String> getCourses();
}
