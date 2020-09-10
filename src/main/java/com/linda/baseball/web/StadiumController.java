package com.linda.baseball.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linda.baseball.model.Stadium;
import com.linda.baseball.repository.StadiumRepository;
import com.linda.baseball.util.Script;
import com.linda.baseball.web.dto.CommonRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumRepository stadiumRepository;
	
	@GetMapping("/stadium")
	public String  stardiumSaveForm() {
		System.out.println("/stadiumSaveForm 입니다.");
		return "/stadium/stadiumSaveForm";
	}	
	
	@PostMapping("/stadium")
	public String  stardiumSaveForm(Stadium stadium) {		
		System.out.println("stadium : "+stadium);
		stadiumRepository.save(stadium);
		return "redirect:/stadiumList";
	}
	
	@GetMapping("/stadiumList")
	public String stardiumList(Model model) {
		System.out.println("stardiumList컨트롤러");
		model.addAttribute("stadiums", stadiumRepository.findAll());
		System.out.println("model : "+ model);
		return "/stadium/stadiumList";
	}
	
    @DeleteMapping("/stadium")
    public @ResponseBody String deleteStadium(int id) {
    	System.out.println("deleteStadium : "+ id);
    	stadiumRepository.deleteById(id);    	
    	//return new CommonRespDto<String>(1, "경기장 삭제 성공");
    	return "완료"; 
    }
    
	
    
}
