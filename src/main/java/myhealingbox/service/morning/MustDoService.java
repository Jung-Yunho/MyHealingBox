package myhealingbox.service.morning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.dao.morning.MustDoDao;
import myhealingbox.entity.morning.MustDo;

@Service
public class MustDoService {
	
	@Autowired
	private MustDoDao mustDoDao;
	
	public List<MustDo> getMustDoList(Integer page) {
		
		List<MustDo> list = mustDoDao.getList(page);
		
		return list;
	}
	
	public MustDo getMustDo(Integer id) {
		
		MustDo mustDo = mustDoDao.get(id);
		
		return mustDo;
	}
	
	public int insertMustDo(MustDo mustDo) {
		
		int result = mustDoDao.insert(mustDo);
		
		return result;
	}
	
	public int updateMustDo(MustDo mustDo) {
		
		int result = mustDoDao.update(mustDo);
		
		return result;
	}
	
	public int deleteMustDo(MustDo mustDo) {
		
		int result = mustDoDao.delete(mustDo);
		
		return result;
	}
}