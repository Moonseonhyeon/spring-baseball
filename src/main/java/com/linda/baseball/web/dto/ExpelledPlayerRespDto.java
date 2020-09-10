package com.linda.baseball.web.dto;

import java.sql.Timestamp;

import com.linda.baseball.web.dto.PlayerAsPositionRespDto.PlayerAsPositionRespDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpelledPlayerRespDto {
	private int playerId;
	private String playerName;
	private String position;	
	private String reason;
	private Timestamp day;

}
