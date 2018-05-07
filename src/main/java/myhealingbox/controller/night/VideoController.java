package myhealingbox.controller.night;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import myhealingbox.entity.night.NightCategory;
import myhealingbox.entity.night.Video;
import myhealingbox.service.night.CategoryService;
import myhealingbox.service.night.VideoService;

@Controller("videoController")
@RequestMapping("/night/video/")
public class VideoController {

	@Autowired
	private VideoService service;

	@Autowired
	private CategoryService categoryService;


	@RequestMapping("list")
	public String list(Model model) {

		List<Video> list = service.getVideoList(1);

		model.addAttribute("videos", list);

		return "night.list";
	}

	@RequestMapping("{id}")
	public String detail(@PathVariable("id") Integer id, Model model) {

		Video video = service.getVideo(id);

		model.addAttribute("video", video);

		return "night.detail";
	}
	/*
	 * @RequestMapping("edit") public String edit() {
	 * 
	 * return "night.edit"; }
	 */

	// reg는 get과 post 둘 다 처리 하기 때문에 둘로 나눠
	@RequestMapping(value = "reg", method = RequestMethod.GET)
	public String reg() {

		return "night.reg";
	}

	@RequestMapping(value = "reg", method = RequestMethod.POST)
	public String reg(Video video, MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		ServletContext ctx = request.getServletContext();
		String path = ctx.getRealPath("/resources/night");
		File f = new File(path);

		if (!f.exists())
			f.mkdirs();

		if (!file.isEmpty())
			try {
				String fname = file.getOriginalFilename();
				InputStream fis = file.getInputStream();
				FileOutputStream fos = new FileOutputStream(path + File.separator + fname);

				byte[] buf = new byte[1024];

				int size = 0;

				while ((size = fis.read(buf, 0, 1024)) != -1) {
					fos.write(buf, 0, size);

					fis.close();
					fos.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		int result = service.insertVideo(video);

		return "redirect:list";
	}

	@RequestMapping("data")
	@ResponseBody
	public String data() {

		return "등록이 완료되었습니다.";
	}

	@RequestMapping(value = "category", method = RequestMethod.GET)
	public String category(Model model) {

		List<NightCategory> list = categoryService.getCategoryList(1);

		model.addAttribute("category", list);

		return "night.category";
	}

	@RequestMapping(value = "category", method = RequestMethod.POST)
	public String category() {

		return "redirect:list";
	}
	
	@RequestMapping("category-edit")
	public String categoryEdit() {

		return "night.category-edit";
	}

	@RequestMapping("favorite")
	public String favorit(Model model) {

		List<Video> list = service.getFavoriteList(1);

		model.addAttribute("favorite", list);

		
		return "night.favorite";
	}

	@RequestMapping("list2")
	public String list2(Model model) {

		List<Video> list = service.getVideoList(1);

		model.addAttribute("videos", list);

		return "night.list2";
	}

	@RequestMapping("reg-edit")
	public String regEdit() {

		return "night.reg-edit";
	}
	

}







