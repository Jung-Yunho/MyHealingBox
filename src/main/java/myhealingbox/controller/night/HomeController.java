package myhealingbox.controller.night;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("nightHomeController")
@RequestMapping("/night/")
public class HomeController {

	@RequestMapping("index")
	public String index() {

		return "night.index";

	}
}
