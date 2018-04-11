package myhealingbox.dao.mybatis.dawn;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.dao.dawn.DawnCategoryDao;
import myhealingbox.entity.dawn.DawnCategory;

@Repository
public class MyBatisDawnCategoryDao implements DawnCategoryDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DawnCategory> getList(Integer page) {
		
		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		List<DawnCategory> categoryList = dawnCategoryDao.getList(page);
		
		return categoryList;
	}

	@Override
	public DawnCategory get(Integer id) {
		
		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		DawnCategory dawnCategory = dawnCategoryDao.get(id);
		
		return dawnCategory;
	}

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
	public int delete(DawnCategory dawnCategory) {

		DawnCategoryDao dawnCategoryDao = sqlSession.getMapper(DawnCategoryDao.class);
		
		int result = dawnCategoryDao.delete(dawnCategory);
		
		return result;
	}

}
