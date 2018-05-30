package myhealingbox.controller.day;

import java.io.File;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import myhealingbox.entity.day.DayCategory;
import myhealingbox.entity.day.DayView;
import myhealingbox.entity.day.WantToDo;
import myhealingbox.service.day.DayService;


@Controller("DayController")
@RequestMapping("/day/")
public class DayController {
	
		@Autowired
		private DayService service;
	   
		// category list
		@RequestMapping("categoryList")
		public String categoryList(Model model) {	
			List<DayCategory> categoryLists = service.getDayCategoryList();
			
			model.addAttribute("categoryLists", categoryLists);
			
			return "day.categoryList";
		}
		
		@RequestMapping("categoryList/delete")
		public String categoryDelete( Integer id) {

			int result = service.deleteCategory(id);
				
			return "redirect:day.categoryList";
		}
		
	   // list
	   /*@RequestMapping("{id}")
	   public String list(@PathVariable("id") Integer id, Model model, String title) {
		  
		  title = service.getDayCategoryTitle(title);
	      List<WantToDo> lists = service.getWantToDoList(id);	      
	      
	      model.addAttribute("title", title);
	      model.addAttribute("lists", lists);
	      
	      return "day.list";
	   }*/

		// list(뷰로 뽑음)
		@RequestMapping("{id}")
		public String list(@PathVariable("id") Integer id, Model model) {
	
			List<DayView> lists = service.getDayViewList(id);
			DayView dayView = service.getDayViewTitle(id);

			model.addAttribute("lists", lists);
			model.addAttribute("dayView",dayView);
	
			return "day.list";
		}
		
		// delete(list)
		@RequestMapping("{id}/delete")
		public String delete(@PathVariable("id") Integer id) {

			int result = service.deleteWantToDo(id);
				
			return "redirect:day.list";
		}
		
	   
	   // detail
		@RequestMapping("{dayCategoryId}/{id}")
		public String detail(@PathVariable("id") Integer id, @PathVariable("dayCategoryId") Integer dayCategoryId, Model model) {
			WantToDo wantToDo = service.getWantToDo(id);
			model.addAttribute("wantToDo",wantToDo);	
			
			return "day.detail";
		}	
	   
		
	   // edit
	   @RequestMapping("edit")
	   public String edit() {

	      return "day.edit";
	   }
	   
	   // write는 get과 post 둘 다 처리 하기 때문에 둘로 나눠
	   @RequestMapping(value="write", method=RequestMethod.GET)
	   public String write(Model model) {
		  List<DayCategory> categoryLists = service.getDayCategoryList();
			
		  model.addAttribute("categoryLists", categoryLists);
		  
	      return "day.write";
	   }
	   
	   @RequestMapping(value="write", method=RequestMethod.POST)
	   public String write(WantToDo wantToDo,HttpServletRequest request
			   , @RequestParam("value")Integer dayCategoryId) {
		  
		   /*WantToDo wantToDo;*/
		  
		  wantToDo.setDayCategoryId(dayCategoryId);
		  
	      int result = service.insertWantToDo(wantToDo);
	      
	      return "redirect:day.categoryList";
	   }
	   
	  
}
