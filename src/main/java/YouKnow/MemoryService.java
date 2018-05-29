package YouKnow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.entity.dawn.DawnView;
import myhealingbox.entity.dawn.Memory;

@Service
public class MemoryService {

	@Autowired
	private MemoryDao memoryDao;
	
	public List<DawnView> getMemoryList(Integer page, Integer id) {

		List<DawnView> memoryList = memoryDao.getList(page, id);
		
		return memoryList;
	}

	public DawnView getMemory(Integer DMId) {
		
		DawnView memory = memoryDao.get(DMId);
		
		return memory;
	}

	public int insertMemory(Memory memory) {
		
		int result = memoryDao.insert(memory);
		
		return result;
	}
	
	public int updateMemory(Memory memory) {
		
		int result = memoryDao.update(memory);
		
		return result;
	}
	
	public int deleteMemory(Integer DMId) {

		int result = memoryDao.delete(DMId);
		
		return result;
	}

}
