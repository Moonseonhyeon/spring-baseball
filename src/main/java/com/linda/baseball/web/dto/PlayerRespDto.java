package com.linda.baseball.web.dto;

import java.sql.Timestamp;

import com.linda.baseball.web.dto.TeamRespDto.TeamRespDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerRespDto {
	private int id;
	private String teamName;
	private String position;
	private String playerName;
	private Timestamp createDate;	
	private int No;
}


