package com.linda.baseball.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Player {
	private int id;
	private String name;
	private int teamId;
	private String position;
	private Timestamp createDate;
}
