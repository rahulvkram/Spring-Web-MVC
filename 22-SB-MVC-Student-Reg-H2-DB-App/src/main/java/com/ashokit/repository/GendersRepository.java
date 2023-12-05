package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entities.GenderDtlsEntity;

public interface GendersRepository extends JpaRepository<GenderDtlsEntity, Serializable> {

	@Query("select genderTxt from GenderDtlsEntity")
	public List<String> getGenders();

}
