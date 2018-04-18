package myhealingbox.service.morning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.dao.morning.MorningCategoryDao;
import myhealingbox.entity.morning.MorningCategory;

//@Service
public class CategoryService {

	@Autowired
	private MorningCategoryDao morningCategoryDao;
	
	public List<MorningCategory> getCategoryList(Integer page) {
		
		List<MorningCategory> list = morningCategoryDao.getList(page);
		
		return list;
	}
	
	public MorningCategory morningCategory(Integer id) {
		
		MorningCategory list = morningCategoryDao.get(id);
		
		return list;
	}
	
	public int insertMorningCategory(MorningCategory morningCategory) {
		
		int result = morningCategoryDao.insert(morningCategory);
		
		return result;
	}
	
	public int updateMorningCategory(MorningCategory morningCategory) {
		
		int result = morningCategoryDao.delete(morningCategory);
		
		return result;
	}
	
	public int deleteMorningCategory(MorningCategory morningCategory) {
		
		int result = morningCategoryDao.delete(morningCategory);
		
		return result;
	}
}
