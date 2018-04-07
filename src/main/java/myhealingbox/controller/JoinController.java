package myhealingbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myhealingbox.entity.Member;
import myhealingbox.service.MemberService;


@Controller
@RequestMapping("/member/")
public class JoinController {

   @Autowired
   private MemberService service;
   
   @RequestMapping(value="join", method=RequestMethod.GET)
   public String join() {

      return "member.join";
   }
   
   @RequestMapping(value="join", method=RequestMethod.POST)
   public String join(Member member) {

      int result = service.insertMember(member);
      
      return "redirect:../index";
   }
   
}