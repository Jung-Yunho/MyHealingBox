package myhealingbox.dao.mybatis.day;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.day.DayViewDao;
import myhealingbox.entity.day.DayView;


public class MyBatisDayViewDao implements DayViewDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DayView> getList(Integer id) {
		DayViewDao dayViewDao = sqlSession.getMapper(DayViewDao.class);
		
		List<DayView> result = dayViewDao.getList(id);
		
		return result;
	}

	@Override
	public DayView getDayViewTitle(Integer id) {
		DayViewDao dayViewDao = sqlSession.getMapper(DayViewDao.class);
		
		DayView result2 = dayViewDao.getDayViewTitle(id);
		
		return result2;
	}




}
