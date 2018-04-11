package myhealingbox.service.dawn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.dao.dawn.DawnCategoryDao;
import myhealingbox.entity.dawn.DawnCategory;

@Service
public class CategoryService {

	@Autowired
	private DawnCategoryDao dawnCategoryDao;
	
	public List<DawnCategory> getCategoryList(Integer page) {

		List<DawnCategory> categoryList = dawnCategoryDao.getList(page);
		
		return categoryList;
	}

	public DawnCategory getDawnCategory(Integer id) {

		DawnCategory dawnCategory = dawnCategoryDao.get(id);
		
		return dawnCategory;
	}
	
	public int insertDawnCategory(DawnCategory dawnCategory) {
		
		int result = dawnCategoryDao.insert(dawnCategory);
		
		return result;
	}

	
	public int updateDawnCategory(DawnCategory dawnCategory) {

		int result = dawnCategoryDao.update(dawnCategory);

		return result;
	}

	public int deleteDawnCategory(DawnCategory dawnCategory) {

		int result = dawnCategoryDao.delete(dawnCategory);

		return result;
	}
}
