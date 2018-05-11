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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.entity.day.DayCategory;
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
			//DayCategory dayCategory = service.getDayCategory(title);
			
			model.addAttribute("categoryLists", categoryLists);
			//model.addAttribute("DayCategory", dayCategory);
			return "day.categoryList";
		}
		
	   // list
	   @RequestMapping("{id}")
	   public String list(@PathVariable("id") Integer id, Model model) {
		   
	      List<WantToDo> lists = service.getWantToDoList(id);	      
	      model.addAttribute("lists", lists);
	      
	      return "day.list";
	   }
	   
	   // detail
		/*@RequestMapping("{id}")
		public String detail(@PathVariable("id") Integer id, Model model) {
			WantToDo wantToDo = service.getWantToDo(id);
			model.addAttribute("wantToDo",wantToDo);
			
			return "day.detail";
		}*/
		
	   
	   // edit
	   @RequestMapping("edit")
	   public String edit() {

	      return "day.edit";
	   }

	   
	   // write는 get과 post 둘 다 처리 하기 때문에 둘로 나눠
	   @RequestMapping(value="write", method=RequestMethod.GET)
	   public String write() {
		   
	      return "day.write";
	   }
	   
	   @RequestMapping(value="write", method=RequestMethod.POST)
	   public String write(WantToDo wantToDo, MultipartFile file, HttpServletRequest request) {
	      
	      ServletContext ctx = request.getServletContext();
	      String path = ctx.getRealPath("/resources/day");
	      File f = new File(path);
	      
	      if(!f.exists())
	         f.mkdirs();
	      
	      if(!file.isEmpty())
	      try {
	         String fname = file.getOriginalFilename();
	         InputStream fis = file.getInputStream();
	         FileOutputStream fos = new FileOutputStream(path + File.separator + fname);
	         
	         byte[] buf = new byte[1024];
	         
	         int size = 0;
	         
	         while((size = fis.read(buf, 0, 1024)) != -1) {
	            fos.write(buf, 0, size);
	            
	            fis.close();
	            fos.close();
	         }
	            
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      
	      int result = service.insertWantToDo(wantToDo);
	      
	      return "redirect:list";
	   }
	   
	  /* @RequestMapping("data")
	   @ResponseBody
	   public String data() {

	      return "안녕하세용";
	   }*/
	   
}
