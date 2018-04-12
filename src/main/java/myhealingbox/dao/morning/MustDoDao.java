package myhealingbox.dao.morning;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.morning.MustDo;

public interface MustDoDao {
	@Select("select * from MustDo order by regDate desc" + 
			"		limit ${(page-1)*15},15")
	
	List<MustDo> getList(@Param("page") Integer page);
	
	
	MustDo get(Integer id);
	
	int insert(MustDo mustDo);
	
	int update(MustDo mustDo);
	
	int delete(MustDo mustDo);
	
}