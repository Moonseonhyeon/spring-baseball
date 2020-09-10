package com.linda.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linda.baseball.model.ExpelledPlayer;
import com.linda.baseball.model.Player;
import com.linda.baseball.repository.ExpelledPlayerRepository;
import com.linda.baseball.repository.PlayerRepository;
import com.linda.baseball.repository.TeamRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ExpelledPlayerController {
	
	private final PlayerRepository playerRepository;
	private final ExpelledPlayerRepository expelledPlayerRepository;
	
	@GetMapping("/out")
	public String  expelledPlayerSaveForm(Model model) {
		System.out.println("/out 입니다.");
		System.out.println("playerRepository.findAll() : "+playerRepository.findAll().toString());
		model.addAttribute("players", playerRepository.findAll());
		return "/player/expelledPlayerSaveForm";
	}	
	
	@PostMapping("/out")
	public String  expelledPlayerSaveProc(ExpelledPlayer expelledPlayer) {		
		System.out.println("expelledPlayerSaveProc - expelledPlayer : "+expelledPlayer);
		expelledPlayerRepository.save(expelledPlayer);
		return "redirect:/expelledPlayerList";
	}
	
	@GetMapping("/expelledPlayerList")
	public String expelledPlayerList(Model model) {
		System.out.println("expelledPlayerList컨트롤러");
		System.out.println("expelledPlayerList - expelledPlayerRepository.findAll() : " + expelledPlayerRepository.findAll());
		model.addAttribute("playerDtos", expelledPlayerRepository.findAll());	
		return "/player/expelledPlayerList";
	}
	
 

}