package com.linda.baseball.repository;

import java.util.List;

import com.linda.baseball.model.Stadium;

public interface StadiumRepository {
	public void save(Stadium stadium);
	public List<Stadium> findAll();
	public void deleteById(int id);
	}
