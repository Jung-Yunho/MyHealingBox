package myhealingbox.dao.mybatis.dawn;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myhealingbox.dao.dawn.MemoryDao;
import myhealingbox.entity.dawn.DawnView;
import myhealingbox.entity.dawn.Memory;

@Repository
public class MyBatisMemoryDao implements MemoryDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DawnView> getList(Integer page, Integer id) {
		
		MemoryDao memoryDao = sqlSession.getMapper(MemoryDao.class);
		
		List<DawnView> memoryList = memoryDao.getList(page, id);
		
		return memoryList;
	}

	@Override
	public DawnView get(Integer DMId) {
		
		MemoryDao memoryDao = sqlSession.getMapper(MemoryDao.class);
		
		DawnView memory = memoryDao.get(DMId);
		
		return memory;
	}

	@Override
	public int insert(Memory memory) {
		
		MemoryDao memoryDao = sqlSession.getMapper(MemoryDao.class);
		
		int result = memoryDao.insert(memory);
		
		return result;
	}

	@Override
	public int update(Memory memory) {
		
		MemoryDao memoryDao = sqlSession.getMapper(MemoryDao.class);
		
		int result = memoryDao.update(memory);
		
		return result;
	}

	@Override
	public int delete(Integer DMId) {
		
		MemoryDao memoryDao = sqlSession.getMapper(MemoryDao.class);
		
		int result = memoryDao.delete(DMId);
		
		return result;
	}

}
