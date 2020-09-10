package com.linda.baseball.web.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamRespDto {
	private int id;
	private String name;
	private String stadiumName;
	private Timestamp createDate;
}
