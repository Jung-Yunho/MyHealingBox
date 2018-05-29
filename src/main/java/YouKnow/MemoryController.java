package YouKnow;

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
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.dawn.DawnView;
import myhealingbox.entity.dawn.Memory;

@Controller("DawnMemoryController2")
@RequestMapping("dawn/memory/")
public class MemoryController {

	@Autowired
	private MemoryService service;
	
	@RequestMapping("list/{id}")
	public String list(@RequestParam(value="p", defaultValue="1")Integer page
							,Model model
							,@PathVariable("id")Integer id) {
		
		List<DawnView> memoryList = service.getMemoryList(page, id);
		model.addAttribute("memoryList", memoryList);
		
		return "dawn.memory.list";
	}
	
	@RequestMapping("list/{id}/{DMId}")
	public String detail(@PathVariable("id")Integer id, Model model
							,@PathVariable("DMId")Integer DMId) {
		
		DawnView memory = service.getMemory(DMId);
		model.addAttribute("memory", memory);
		
		return "dawn.memory.detail";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String reg() {
		
		return "dawn.memory.reg";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.POST)
	public String reg(Memory memory, MultipartFile file
							, HttpServletRequest request) {
		
		String memberId = request.getParameter("memberId");
		ServletContext ctx = request.getServletContext();
		String path = ctx.getRealPath("/resources/dawn/"+memberId);
		
		File f = new File(path);
		
		if(!f.exists())
			f.mkdirs();
		
		if(!file.isEmpty()) {
			try {
				String fname = file.getOriginalFilename();
				
				InputStream fis = file.getInputStream();
				
				FileOutputStream fos = new FileOutputStream(path+File.separator+fname);
				
				byte[] buf = new byte[1024];
				int size = 0;
				/*System.out.println("하이~");*/
				if((size = fis.read(buf, 0, 1024)) != -1)
					fos.write(buf, 0, size);
				
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int result = service.insertMemory(memory);
		return "redirect:list";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit() {
		
		return "dawn.memory.edit";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(Memory memory,
						MultipartFile file, HttpServletRequest request) {
		
		int result = service.updateMemory(memory);
		
		return "redirect:dawn.memory.list";
	}
	
	@RequestMapping("list/{id}/{DMId}/delete")
	public String delete(@PathVariable("DMId")Integer DMId) {
		
		int result = service.deleteMemory(DMId);
		
		return "redirect:../../";
	}
}