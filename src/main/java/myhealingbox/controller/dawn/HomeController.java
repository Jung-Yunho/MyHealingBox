package myhealingbox.controller.dawn;

import java.io.UnsupportedEncodingException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.service.dawn.CategoryService;


@Controller("DawnHomeController")
@RequestMapping("/dawn/home")
public class HomeController {

	@Autowired
	private CategoryService service;
	
	
	/*--------------- CategoryList 메인 ---------------*/
	/*@GetMapping("index")
	public String index(Model model) {
		
		List<DawnCategory> categoryList = service.getCategoryList();
		
		model.addAttribute("categoryList", categoryList);
		return "dawn.home.index";
	}*/
	
	
	/*--------------- CategoryList 등록 ---------------*/
	@GetMapping("reg")
	public String reg() {
		
		return "dawn.home.reg";
	}
	
	@PostMapping("reg")
	public String reg(DawnCategory dawnCategory
						, HttpServletRequest request
						, HttpServletResponse response) throws UnsupportedEncodingException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		int result = service.insertDawnCategory(dawnCategory);
		
		return "redirect:dawn.home.index";
	}
	
	
	/*--------------- CategoryList 수정 ---------------*/
	@GetMapping("edit")
	public String edit() {
		
		return "dawn.home.edit";
	}
	
	@PostMapping("edit")
	public String edit(DawnCategory dawnCategory
						, HttpServletRequest request
						, HttpServletResponse response) throws UnsupportedEncodingException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		int result = service.updateDawnCategory(dawnCategory);
		
		return "redirect:dawn.home.index";
	}
	
	
	/*--------------- CategoryList 삭제 ---------------*/
	@PostMapping("list/{id}/delete")
	public String delete(@PathVariable("id")Integer id) {
		
		int result = service.deleteDawnCategory(id);
		
		return "redirec:../../index";
	}
}








