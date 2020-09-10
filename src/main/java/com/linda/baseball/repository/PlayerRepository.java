package com.linda.baseball.repository;

import java.util.List;

import com.linda.baseball.model.Player;
import com.linda.baseball.web.dto.PlayerAsPositionRespDto;
import com.linda.baseball.web.dto.PlayerRespDto;


public interface PlayerRepository {
	public void save(Player player);
	public List<PlayerRespDto> findAll();
	public void deleteById(int id);
	public List<PlayerAsPositionRespDto> findAllAsPosition();
}
