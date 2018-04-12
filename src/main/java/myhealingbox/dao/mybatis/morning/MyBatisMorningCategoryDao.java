package myhealingbox.dao.mybatis.morning;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.dao.morning.MorningCategoryDao;
import myhealingbox.entity.morning.MorningCategory;

@Repository
public class MyBatisMorningCategoryDao implements MorningCategoryDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<MorningCategory> getList(Integer page) {
		
		MorningCategoryDao morningCategoryDao = sqlSession.getMapper(MorningCategoryDao.class);
		
		List<MorningCategory> result = morningCategoryDao.getList(page);
		
		return result;
	}

	@Override
	public MorningCategory get(Integer id) {
		
		MorningCategoryDao morningCategoryDao = sqlSession.getMapper(MorningCategoryDao.class);
		
		MorningCategory result = morningCategoryDao.get(id);
		
		return result;
	}

	@Override
	public int insert(MorningCategory morningCategory) {
		
		MorningCategoryDao morningCategoryDao = sqlSession.getMapper(MorningCategoryDao.class);
		
		int result = morningCategoryDao.insert(morningCategory);
		
		return result;
		
	}

	@Override
	public int update(MorningCategory morningCategory) {
		
		MorningCategoryDao morningCategoryDao = sqlSession.getMapper(MorningCategoryDao.class);
		
		int result = morningCategoryDao.update(morningCategory);
		
		return result;
	}

	@Override
	public int delete(MorningCategory morningCategory) {
		
		MorningCategoryDao morningCategoryDao = sqlSession.getMapper(MorningCategoryDao.class);
		
		int result = morningCategoryDao.delete(morningCategory);
		
		return result;
	}
	
	
	
}