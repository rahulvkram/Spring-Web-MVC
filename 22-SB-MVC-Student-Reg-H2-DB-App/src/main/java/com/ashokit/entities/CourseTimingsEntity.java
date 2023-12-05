package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_TIMINGS")
public class CourseTimingsEntity {

	@Id
	@Column(name = "TIMING_ID")
	private Integer timingId;

	@Column(name = "TIMING")
	private String timing;

}
