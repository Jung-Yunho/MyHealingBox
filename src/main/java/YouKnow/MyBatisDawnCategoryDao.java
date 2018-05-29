package YouKnow;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.entity.dawn.DawnView;

@Repository
public class MyBatisDawnCategoryDao implements DawnCategoryDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DawnView> getList(Integer page) {
		
		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		List<DawnView> categoryList = dawnCategoryDao.getList(page);
		
		return categoryList;
	}

	/*@Override
	public DawnView get(Integer DCId) {
		
		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		DawnView dawnView = dawnCategoryDao.get(DCId);
		
		return dawnView;
	}*/

	@Override
	public int insert(DawnCategory dawnCategory) {
		
		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		int result = dawnCategoryDao.insert(dawnCategory);
		
		return result;
	}

	@Override
	public int update(DawnCategory dawnCategory) {

		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		int result = dawnCategoryDao.update(dawnCategory);
		
		return result;
	}

	@Override
	public int delete(Integer id) {

		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		int result = dawnCategoryDao.delete(id);
		
		return result;
	}

}
