package myhealingbox.controller.night;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.night.NightCategory;
import myhealingbox.service.night.CategoryService;


@Controller("nightHomeController")
@RequestMapping("/night/")
public class HomeController {

	@Autowired
	private CategoryService service;
	
	@RequestMapping("index")
	public String index(@RequestParam(value="p", defaultValue="1")
					Integer page, Model model) {
		
		//List<DawnCategory> categoryList = service.getCategoryList(page);
		//model.addAttribute("categoryList", categoryList);
		
		return "night.category";
	}
	
	/*@RequestMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
		
		NightCategory nightCategory = service.getNightCategory(id);
		model.addAttribute("nightCategory", nightCategory);
		return "night.list";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String reg() {
		
		return "night.reg";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.POST)
	public String reg(NightCategory nightCategory,
					MultipartFile file, HttpServletRequest request) {
		
		int result = service.insertNightCategory(nightCategory);
		
		return "redirect:night.category";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit() {
		
		return "night.category-edit";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(NightCategory nightCategory,HttpServletRequest request) {
		
		int result = service.updateNightCategory(nightCategory);
		
		return "redirect:night.category";
	}*/
}