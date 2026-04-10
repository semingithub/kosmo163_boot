package com.semin.app.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semin.app.page.Pager;

@Controller
@RequestMapping("/professor/*")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("list")
	public void list(Pager pager, Model model) throws Exception {
		List<ProfessorDTO> li = professorService.list(pager);
		model.addAttribute("list", li);
	}
	
	@GetMapping("detail")
	public void detail(ProfessorDTO professorDTO, Model model) throws Exception {
		professorDTO = professorService.detail(professorDTO);
		model.addAttribute("detail", professorDTO);
	}
	
	@GetMapping("create")
	public void create() {
		
	}
	
	@PostMapping("create")
	public String create(ProfessorDTO professorDTO) throws Exception {
		int result = professorService.create(professorDTO);
		return "redirect:./list";
	}
	
	@PostMapping("delete")
	public String delete(ProfessorDTO professorDTO) throws Exception {
		int result = professorService.delete(professorDTO);
		return "redirect:./list";		
	}
	
	@GetMapping("update")
	public void update(ProfessorDTO professorDTO, Model model) throws Exception {
		professorDTO = professorService.detail(professorDTO);
		model.addAttribute("update", professorDTO);
	}
	
	@PostMapping("update")
	public String update(ProfessorDTO professorDTO) throws Exception {
		int result = professorService.update(professorDTO);
		return "redirect:./list";
	}

}
