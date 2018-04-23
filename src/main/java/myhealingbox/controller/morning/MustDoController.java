package myhealingbox.controller.morning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myhealingbox.service.morning.MustDoService;

@Controller("morningController")
@RequestMapping("/morning/")
public class MustDoController {
	
	@Autowired
	private MustDoService mustDoService;
	

}