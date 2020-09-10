package com.linda.baseball.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerAsPositionRespDto {
	private String position;
	private String kia;
	private String lotte;	
	private String nc;

}