package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "GENDER_DTLS")
public class GenderDtlsEntity {

	@Id
	@Column(name = "GENDER_Id")
	private Integer genderId;

	@Column(name = "GENDER_TXT")
	private String genderTxt;

}
