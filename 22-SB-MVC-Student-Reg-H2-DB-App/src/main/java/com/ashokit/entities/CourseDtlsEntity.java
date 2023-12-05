package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_DTLS")
public class CourseDtlsEntity {

	@Id
	@Column(name = "COURSE_ID")
	private Integer courseId;

	@Column(name = "COURSE_NAME")
	private String courseName;

}
