package com.linda.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linda.baseball.model.Player;
import com.linda.baseball.model.Stadium;
import com.linda.baseball.model.Team;
import com.linda.baseball.repository.PlayerRepository;
import com.linda.baseball.repository.StadiumRepository;
import com.linda.baseball.repository.TeamRepository;
import com.linda.baseball.util.Script;
import com.linda.baseball.web.dto.CommonRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final TeamRepository teamRepository;
	private final PlayerRepository playerRepository;
	
	@GetMapping("/player")
	public String  playerSaveForm(Model model) {
		System.out.println("/playerSaveForm 입니다.");
		System.out.println("teamRepository.findAll() : "+teamRepository.findAll().toString());
		model.addAttribute("teams", teamRepository.findAll());
		return "/player/playerSaveForm";
	}	
	
	@PostMapping("player")
	public String  playerSaveProc(Player player) {		
		System.out.println("playerSaveProc - player : "+player);
		playerRepository.save(player);
		return "redirect:/playerList";
	}
	
	@GetMapping("/playerList")
	public String playerList(Model model) {
		System.out.println("playerList컨트롤러");
		model.addAttribute("playerDtos", playerRepository.findAll());
		System.out.println("model : "+ model);
		return "/player/playerList";
	}
	
    @DeleteMapping("/player")
    public @ResponseBody String deletePlayer(int id) {
    	System.out.println("deletePlayer : "+ id);
    	playerRepository.deleteById(id);    	
    	//return new CommonRespDto<String>(1, "경기장 삭제 성공");
    	return "완료"; 
    }
      
    @GetMapping("/playerListAsPosition")
    public String playerListAsPosition(Model model) {
    	System.out.println("playerListAsPosition 컨트롤러 입니다.");
    	System.out.println("playerListAsPosition-playerRepository.findAll() : "+ playerRepository.findAll());
    	model.addAttribute("playersAsPositionDtos", playerRepository.findAllAsPosition());
    	return "/player/playerListAsPosition";
    }
    
}
