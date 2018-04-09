package myhealingbox.controller.dawn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("DawnIndexController")
@RequestMapping("/dawn/")
public class IndexController {

	@RequestMapping("index")
	public String index() {
		
		return "dawn.index";
	}
}
