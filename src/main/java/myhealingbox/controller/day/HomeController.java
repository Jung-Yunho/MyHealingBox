package myhealingbox.controller.day;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller("DayHomeController")
@RequestMapping("/day/")
public class HomeController {
	
	@RequestMapping("main")
	public String index() {
		
		return "day.main"; 

	}
}