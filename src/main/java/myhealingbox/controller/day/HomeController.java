package myhealingbox.controller.day;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day/")
public class HomeController {
	
	@RequestMapping("main")
	public String index() {
		
		return "day.main"; 

	}
}
