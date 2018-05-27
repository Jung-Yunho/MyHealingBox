package myhealingbox.controller.dawn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.dawn.Memory;
import myhealingbox.service.dawn.MemoryService;

@Controller("DawnMemoryController")
@RequestMapping("dawn/memory/")
public class MemoryController {

	@Autowired
	private MemoryService service;
	
	
	/*--------------- Memory 메인 ---------------*/
	/*@GetMapping("list/{id}")
	public String list(@PathVariable("id")Integer id
						,Model model) {
		
		List<Memory> memoryList = service.getMemoryList(id);
		
		model.addAttribute("memoryList", memoryList);
		
		return "dawn.memory/list";
	}*/
	
	
	/*--------------- Memory 상세 ---------------*/
	/*@GetMapping("list/{id}/{DMId}")
	public String list(@PathVariable("id")Integer id
						, @PathVariable("DMId")Integer DMId
						, Model model) {
		
		Memory memory = service.getMemory(id, DMId);
		
		model.addAttribute("memory", memory);
		
		return "dawn.memory.detail";
	}*/
	
	
	/*--------------- Memory 등록 ---------------*/
	@GetMapping("reg")
	public String reg() {
		
		return "dawn.memory.reg";
	}
	
	@PostMapping("reg")
	public String reg(Memory memory
						, MultipartFile file
						, HttpServletRequest request
						, HttpServletResponse response) throws UnsupportedEncodingException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		/*--------------- File System Start ---------------*/
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
		/*--------------- File System End ---------------*/
		
		int result = service.insertMemory(memory);
		
		return "redirect:list";
	}
	
	
	/*--------------- Memory 수정 ---------------*/
	@GetMapping("edit")
	public String edit() {
		
		return "dawn.memory.edit";
	}
	
	@PostMapping("edit")
	public String edit(Memory memory
						, MultipartFile file
						, HttpServletRequest request
						, HttpServletResponse response) throws UnsupportedEncodingException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		/*--------------- File System Start ---------------*/
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
		/*--------------- File System End ---------------*/
		
		int result = service.updateMemory(memory);
		
		return "redirect:list";
	}
	
	
	/*--------------- Memory 삭제 ---------------*/
	@PostMapping("list/{id}/{DMId}/delete")
	public String delete(@PathVariable("id")Integer id
						,@PathVariable("DMId")Integer DMId) {
		
		int result = service.deleteMemory(id, DMId);
		
		return "redirect:../../";
	}
}










