package myhealingbox.dao.mybatis.night;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.dawn.DawnCategoryDao;
import myhealingbox.dao.night.NightCategoryDao;
import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.entity.night.NightCategory;

public class MyBatisNightCategoryDao implements NightCategoryDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<NightCategory> getList(Integer page) {
		
		NightCategoryDao nightCategoryDao = sqlSession.getMapper(NightCategoryDao.class);

		List<NightCategory> categoryList = nightCategoryDao.getList(page);

		return categoryList;
	}

	@Override
	public NightCategory get(Integer id) {
		
		NightCategoryDao nightCategoryDao = sqlSession.getMapper(NightCategoryDao.class);

		NightCategory nightCategory = nightCategoryDao.get(id);

		return nightCategory;
	}

	@Override
	public int insert(NightCategory nightCategory) {
		
		NightCategoryDao nightCategoryDao = sqlSession.getMapper(NightCategoryDao.class);
		
		int result = nightCategoryDao.insert(nightCategory);
		
		return result;
	}

	@Override
	public int update(NightCategory nightCategory) {

		NightCategoryDao nightCategoryDao = sqlSession.getMapper(NightCategoryDao.class);
		
		int result = nightCategoryDao.update(nightCategory);
		
		return result;
	}

	@Override
	public int delete(NightCategory nightCategory) {

		NightCategoryDao nightCategoryDao = sqlSession.getMapper(NightCategoryDao.class);
		
		int result = nightCategoryDao.delete(nightCategory);
		
		return result;
	}

}
