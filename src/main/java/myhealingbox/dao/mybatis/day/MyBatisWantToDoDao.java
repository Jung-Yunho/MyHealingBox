package myhealingbox.dao.mybatis.day;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.day.WantToDoDao;
import myhealingbox.entity.day.WantToDo;

public class MyBatisWantToDoDao implements WantToDoDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<WantToDo> getList(Integer page) {
		WantToDoDao wantToDoDao = sqlSession.getMapper(WantToDoDao.class);
		
		List<WantToDo> result = wantToDoDao.getList(page);
		
		return result;
	}

	@Override
	public WantToDo get(Integer id) {
		WantToDoDao wantToDoDao = sqlSession.getMapper(WantToDoDao.class);
		
		WantToDo result = wantToDoDao.get(id);
		
		return result;
	}

	@Override
	public int insert(WantToDo wantToDo) {
		WantToDoDao wantToDoDao = sqlSession.getMapper(WantToDoDao.class);
		
		int result = wantToDoDao.insert(wantToDo);
		
		return result;
	}
	


}
