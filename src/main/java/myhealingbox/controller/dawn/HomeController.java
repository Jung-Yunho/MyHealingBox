package myhealingbox.controller.dawn;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.service.dawn.CategoryService;

@Controller("DawnHomeController")
@RequestMapping("/dawn/home/")
public class HomeController {

	@Autowired
	private CategoryService service;
	
	@RequestMapping("index")
	public String index(@RequestParam(value="p", defaultValue="1")
					Integer page, Model model) {
		
		List<DawnCategory> categoryList = service.getCategoryList(page);
		model.addAttribute("categoryList", categoryList);
		
		return "dawn.home.index";
	}
	
	@RequestMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
		
		//DawnCategory dawnCategory = service.getDawnCategory(id);
		//model.addAttribute("dawnCategory", dawnCategory);
		return "dawn.memory.list";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String reg() {
		
		return "dawn.home.reg";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.POST)
	public String reg(DawnCategory dawnCategory,
					MultipartFile file, HttpServletRequest request) {
		
		int result = service.insertDawnCategory(dawnCategory);
		
		return "redirect:dawn.home.index";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit() {
		
		return "dawn.home.edit";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(DawnCategory dawnCategory,HttpServletRequest request) {
		
		int result = service.updateDawnCategory(dawnCategory);
		
		return "redirect:dawn.home.index";
	}
}
