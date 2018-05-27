package YouKnow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.entity.dawn.DawnView;

@Service
public class CategoryService {

	@Autowired
	private DawnCategoryDao dawnCategoryDao;
	
	public List<DawnView> getCategoryList(Integer page) {

		List<DawnView> categoryList = dawnCategoryDao.getList(page);
		
		return categoryList;
	}

	/*public DawnView getDawnCategory(Integer DCId) {

		DawnView dawnView = dawnCategoryDao.get(DCId);
		
		return dawnView;
	}*/
	
	public int insertDawnCategory(DawnCategory dawnCategory) {
		
		int result = dawnCategoryDao.insert(dawnCategory);
		
		return result;
	}

	
	public int updateDawnCategory(DawnCategory dawnCategory) {

		int result = dawnCategoryDao.update(dawnCategory);

		return result;
	}

	public int deleteDawnCategory(Integer id) {

		int result = dawnCategoryDao.delete(id);

		return result;
	}
}
