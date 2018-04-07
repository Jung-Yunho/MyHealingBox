package myhealingbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/")
public class MemberController {

   
   @RequestMapping(value="login", method=RequestMethod.GET)
   public String login() {

      return "member.login";
   }
   
/*   Spring Security가 제공하는 걸 씀
   @RequestMapping(value="login", method=RequestMethod.POST)
   public String login(String id, String pwd) {

      return "redirect:../index";
   }
   */
   
}