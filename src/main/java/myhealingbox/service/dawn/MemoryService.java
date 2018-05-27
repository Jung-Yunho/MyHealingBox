package myhealingbox.service.dawn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.dao.dawn.MemoryDao;
import myhealingbox.entity.dawn.Memory;

@Service
public class MemoryService {

	@Autowired
	private MemoryDao memoryDao;
	
	public List<Memory> getMemoryList(Integer id) {
		return null;

		/*List<Memory> memoryList = memoryDao.getList(id);
		
		return memoryList;*/
	}

	public Memory getMemory(Integer id, Integer DMId) {
		return null;
		
		/*Memory memory = memoryDao.get(id, DMId);
		
		return memory;*/
	}	

	public int insertMemory(Memory memory) {

		int result = memoryDao.insert(memory);

		return result;
	}

	public int updateMemory(Memory memory) {

		int result = memoryDao.update(memory);

		return result;
	}

	public int deleteMemory(Integer id, Integer DMId) {

		int result = memoryDao.delete(id, DMId);

		return result;
	}

}
