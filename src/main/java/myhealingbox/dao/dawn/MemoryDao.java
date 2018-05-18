package myhealingbox.dao.dawn;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import myhealingbox.entity.dawn.Memory;

public interface MemoryDao {

	@Select("select * from Memory where id=#{id} order by regDate desc" + 
			"		limit ${(page-1)*15},15")
	List<Memory> getList(@Param("page") Integer page, @Param("id")Integer id);

	Memory get(Integer id);

	int insert(Memory memory);

	int update(Memory memory);

	int delete(Memory memory);

}
