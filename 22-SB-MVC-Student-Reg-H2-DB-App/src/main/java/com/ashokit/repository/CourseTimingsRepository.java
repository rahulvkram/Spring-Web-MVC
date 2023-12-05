package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entities.CourseTimingsEntity;

public interface CourseTimingsRepository extends JpaRepository<CourseTimingsEntity, Serializable> {

	@Query("select timing from CourseTimingsEntity")
	public List<String> getTimes();

}
