package com.linda.baseball.repository;

import java.util.List;

import com.linda.baseball.model.Stadium;
import com.linda.baseball.model.Team;
import com.linda.baseball.web.dto.TeamRespDto;

public interface TeamRepository {
	public void save(Team team);
	public List<TeamRespDto> findAll();
	public void deleteById(int id);

}
