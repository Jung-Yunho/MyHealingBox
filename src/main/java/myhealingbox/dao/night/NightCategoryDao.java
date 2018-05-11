package myhealingbox.dao.night;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.night.NightCategory;

public interface NightCategoryDao {

	/*@Select("select * from NightCategory order by regDate " + 
			"		limit ${(page-1)*15},15")*/
	List<NightCategory> getCategoryList(Integer page);

	NightCategory get(Integer id);

	int insert(NightCategory nightCategory);
	
	int update(NightCategory nightCategory);
	
	int delete(NightCategory nightCategory);


}
