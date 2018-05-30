package myhealingbox.service.day;

import java.util.List;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;


import myhealingbox.dao.day.DayCategoryDao;
import myhealingbox.dao.day.DayViewDao;
import myhealingbox.dao.day.WantToDoDao;

import myhealingbox.entity.day.DayCategory;
import myhealingbox.entity.day.DayView;
import myhealingbox.entity.day.WantToDo;



public class DayService {

	@Autowired
	private WantToDoDao wantToDoDao;
	@Autowired
	private DayCategoryDao dayCategoryDao;
	@Autowired
	private DayViewDao dayViewDao;
	
	
	// 낮 _DayCategory 관련 ----------------------------------------------
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
	
	public int deleteCategory(Integer id) {
		dayCategoryDao.delete(id);
		return 0;
	}

	// 낮 _WantToDo 관련 -------------------------------------------
	/*public List<WantToDo> getWantToDoList(Integer id) {
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
	}*/

	public WantToDo getWantToDo(Integer id) {
		WantToDo wantToDo = wantToDoDao.get(id);
		
		return wantToDo;
	}

	public int insertWantToDo(WantToDo wantToDo) {
		wantToDoDao.insert(wantToDo);
		return 0;
	}
	
	public int deleteWantToDo(Integer id) {
		wantToDoDao.delete(id);
		return 0;
	}

	
	
	// 낮 _DayView 관련 -------------------------------------------
	public List<DayView> getDayViewList(Integer id) {
		List<DayView> list = dayViewDao.getDayViewList(id);

		for(DayView n : list) {
			String content = n.getWTDcontent();
			
			if(content==null)
				continue;
			
			Document doc = Jsoup.parse(content);
			String text = doc.text();
			Element img = doc.select("img").first();
			
			if(img!=null) {
				n.setWTDcontent(img.toString()+text);
			}
			else
				n.setWTDcontent(text);
		}
		
		return list;
	}

	public DayView getDayViewTitle(Integer id) {
		DayView dayView = dayViewDao.getDayViewTitle(id);		
		
		return dayView;
	}




}
