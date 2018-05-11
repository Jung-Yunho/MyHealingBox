package myhealingbox.service.night;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.night.NightCategoryDao;
import myhealingbox.entity.night.NightCategory;
import myhealingbox.entity.night.Video;

public class CategoryService {

	@Autowired
	private NightCategoryDao nightCategoryDao;
	
	public List<NightCategory> getCategoryList(Integer page) {

		List<NightCategory> result = nightCategoryDao.getCategoryList(page);
		
		return result;
		
	}

	public NightCategory getNightCategory(Integer id) {

		NightCategory result = nightCategoryDao.get(id);
		
		return result;
	}
	
	public int insertNightCategory(NightCategory nightCategory) {
		
		int result = nightCategoryDao.insert(nightCategory);
		
		return result;
	}

	
	public int updateNightCategory(NightCategory nightCategory) {

		int result = nightCategoryDao.update(nightCategory);

		return result;
	}

	public int deleteNightCategory(NightCategory nightCategory) {

		int result = nightCategoryDao.delete(nightCategory);

		return result;
	}

}
