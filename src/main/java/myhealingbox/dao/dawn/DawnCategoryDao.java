package myhealingbox.dao.dawn;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.dawn.DawnCategory;

public interface DawnCategoryDao {

	/*@Select("select * from DawnCategory order by regDate desc" + 
			"		limit ${(page-1)*15},15")*/
	List<DawnCategory> getList(@Param("page") Integer page);

	DawnCategory get(Integer id);

	int insert(DawnCategory dawnCategory);
	
	int update(DawnCategory dawnCategory);
	
	int delete(DawnCategory dawnCategory);

}
