package myhealingbox.controller.night;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/night/")
public class HomeController {
	
	@RequestMapping("index")
	public String index() {
		
		return "night.index"; 
		
		/*return index; 
		
		dispatcher-servlet에서 
		<property name="prefix"  value="/WEB-INF/views/"/>
	    <property name="suffix" value=".jsp" /> 
	    */
	}
}
