package myhealingbox.dao.dawn;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.dawn.DawnCategory;
import myhealingbox.entity.dawn.DawnView;

public interface DawnCategoryDao {

	/*@Select("select * from DawnCategory order by regDate desc" + 
			"		limit ${(page-1)*15},15")*/
	List<DawnView> getList(@Param("page") Integer page);

	//DawnView get(Integer DCId);

	int insert(DawnCategory dawnCategory);
	
	int update(DawnCategory dawnCategory);
	
	int delete(Integer id);

}
