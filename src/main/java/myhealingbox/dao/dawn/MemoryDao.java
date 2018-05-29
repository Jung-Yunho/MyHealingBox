package myhealingbox.dao.dawn;

import java.util.List;

import myhealingbox.entity.dawn.Memory;

public interface MemoryDao {

	List<Memory> getList(Integer id);

	Memory get(Integer id, Integer DMId);

	int insert(Memory memory);

	int update(Memory memory);

	int delete(Integer id, Integer DMId);

}
