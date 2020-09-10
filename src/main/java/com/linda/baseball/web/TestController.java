package com.linda.baseball.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.linda.baseball.repository.StadiumRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@org.springframework.stereotype.Controller
public class TestController {
	
	private final StadiumRepository stadiumRepository;
	
	@GetMapping({"index"})
	public String TestIndex() {
		System.out.println("안녕");
		return "index";
	}
	
	@GetMapping({"/test/stadiumList"})
	public String TestStadiumList(Model model) {
		System.out.println("테스트경기장목록");
		model.addAttribute("stadiums", stadiumRepository.findAll());
		System.out.println("model : "+ model);
		return "/stadium/stadiumList";
	}

}
