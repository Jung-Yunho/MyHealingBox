package myhealingbox.service.day;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	// 낮 _카테고리 관련 ----------------------------------------------
	public List<DayCategory> getDayCategoryList() {
		List<DayCategory> categoryList = dayCategoryDao.getList();		
		return categoryList;
	}
	
	public DayCategory getDayCategory(Integer id) {
		DayCategory dayCategory = dayCategoryDao.get(id);		
		return dayCategory ;
	}
	
	public int insertDayCategory(DayCategory dayCategory) {		
		dayCategoryDao.insert(dayCategory);
		return 0;
	}
	

	// 낮 _하고싶은일들 관련 -------------------------------------------
	public List<WantToDo> getWantToDoList(Integer id) {
		List<WantToDo> list = wantToDoDao.getList(id);

		for(WantToDo n : list) {
			String content = n.getContent();
			
			if(content==null)
				continue;
			
			Document doc = Jsoup.parse(content);
			String text = doc.text();
			Element img = doc.select("img").first();
			
			if(img!=null) {
				n.setContent(img.toString()+text);
			}
			else
				n.setContent(text);
		}
		
		return list;
	}

	public WantToDo getWantToDo(Integer id) {
		WantToDo wantToDo = wantToDoDao.get(id);
		
		return wantToDo;
	}

	public int insertWantToDo(WantToDo wantToDo) {
		wantToDoDao.insert(wantToDo);
		return 0;
	}

	public String getListTitle(Integer id) {
		
		return null;
	}
	
	
	

}
