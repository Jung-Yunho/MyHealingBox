package myhealingbox.service.day;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.day.DayCategoryDao;
import myhealingbox.dao.day.WantToDoDao;
import myhealingbox.dao.night.VideoDao;
import myhealingbox.entity.day.DayCategory;
import myhealingbox.entity.day.WantToDo;
import myhealingbox.entity.night.Video;

public class DayService {

	@Autowired
	private WantToDoDao wantToDoDao;
	@Autowired
	private DayCategoryDao dayCategoryDao;
	
	public List<DayCategory> getDayCategoryList() {
		List<DayCategory> categoryList = dayCategoryDao.getList();
		
		// 아직완성아님
		
		return categoryList;
	}

	public List<WantToDo> getWantToDoList(int page) {
		List<WantToDo> list = WantToDoDao.getList(page);

		return list;
	}

	public WantToDo getWantToDo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertWantToDo(WantToDo wantToDo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
