package myhealingbox.dao.mybatis.day;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.dao.day.DayCategoryDao;
import myhealingbox.entity.day.DayCategory;


public class MyBatisDayCategoryDao implements DayCategoryDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DayCategory> getList() {
		DayCategoryDao dayCategoryDao = sqlSession.getMapper(DayCategoryDao.class);
		
		List<DayCategory> result = dayCategoryDao.getList();
		
		return result;
	}

	@Override
	public DayCategory get(Integer id) {
		DayCategoryDao dayCategoryDao = sqlSession.getMapper(DayCategoryDao.class);
		
		DayCategory result = dayCategoryDao.get(id);
		
		return result;
	}

	
	@Override
	public int insert(DayCategory dayCategory) {
		DayCategoryDao dayCategoryDao = sqlSession.getMapper(DayCategoryDao.class);
		
		int result = dayCategoryDao.insert(dayCategory);		
		
		return result;
	}


	




}
