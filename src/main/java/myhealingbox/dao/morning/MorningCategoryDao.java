package myhealingbox.dao.morning;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.morning.MorningCategory;

public interface MorningCategoryDao {

	@Select("select * from MorningCategory order by regDate desc" + 
			"		limit ${(page-1)*15},15")
	List<MorningCategory> getList(@Param("page") Integer page);
	
	MorningCategory get(Integer id);
	
	int insert(MorningCategory morningCategory);
	
	int update(MorningCategory morningCategory);
	
	int delete(MorningCategory morningCategory);
	
}
