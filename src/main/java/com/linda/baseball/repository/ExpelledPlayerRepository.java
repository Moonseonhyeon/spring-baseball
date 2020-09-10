package com.linda.baseball.repository;

import java.util.List;

import com.linda.baseball.model.ExpelledPlayer;
import com.linda.baseball.web.dto.ExpelledPlayerRespDto;

public interface ExpelledPlayerRepository {
	public void save(ExpelledPlayer expelledPlayer);
	public List<ExpelledPlayerRespDto> findAll(); 

}



		
		
		