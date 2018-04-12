package myhealingbox.dao.mybatis.morning;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.dao.morning.MustDoDao;
import myhealingbox.entity.morning.MustDo;

@Repository
public class MyBatisMustDoDao implements MustDoDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<MustDo> getList(Integer page) {
		
		MustDoDao mustDoDao = sqlSession.getMapper(MustDoDao.class);
		
		List<MustDo> result = mustDoDao.getList(page);
		
		return result;
	}

	@Override
	public MustDo get(Integer id) {
		
		MustDoDao mustDoDao = sqlSession.getMapper(MustDoDao.class);
		
		MustDo result = mustDoDao.get(id);
		
		return result;
	}

	@Override
	public int insert(MustDo mustDo) {
		
		MustDoDao mustDoDao = sqlSession.getMapper(MustDoDao.class);
		
		int result = mustDoDao.insert(mustDo);
		
		return result;
	}

	@Override
	public int update(MustDo mustDo) {

		MustDoDao mustDoDao = sqlSession.getMapper(MustDoDao.class);
		
		int result = mustDoDao.update(mustDo);
		
		return result;
	}

	@Override
	public int delete(MustDo mustDo) {
		
		MustDoDao mustDoDao = sqlSession.getMapper(MustDoDao.class);
		
		int result = mustDoDao.delete(mustDo);
		
		return result;
		
	}
	
}