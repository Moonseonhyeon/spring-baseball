package com.linda.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linda.baseball.model.Stadium;
import com.linda.baseball.model.Team;
import com.linda.baseball.repository.StadiumRepository;
import com.linda.baseball.repository.TeamRepository;
import com.linda.baseball.util.Script;
import com.linda.baseball.web.dto.CommonRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamRepository teamRepository;
	private final StadiumRepository stadiumRepository;
	
	@GetMapping("/team")
	public String  teamSaveForm(Model model) {
		System.out.println("/teamSaveForm 입니다.");
		System.out.println("stadiumRepository.findAll() : "+stadiumRepository.findAll().toString());
		model.addAttribute("stadiums", stadiumRepository.findAll());
		return "/team/teamSaveForm";
	}	
	
	@PostMapping("/team")
	public String  stardiumSave(Team team) {		
		System.out.println("team : "+team);
		teamRepository.save(team);
		return "redirect:/teamList";
	}
	
	@GetMapping("/teamList")
	public String teamList(Model model) {
		System.out.println("teamList컨트롤러");
		model.addAttribute("teamDtos", teamRepository.findAll());
		System.out.println("model : "+ model);
		return "/team/teamList";
	}
	
    @DeleteMapping("/team")
    public @ResponseBody String deleteTeam(int id) {
    	System.out.println("deleteTeam : "+ id);
    	teamRepository.deleteById(id);    	
    	//return new CommonRespDto<String>(1, "경기장 삭제 성공");
    	return "완료"; 
    }
    
    
    
}
