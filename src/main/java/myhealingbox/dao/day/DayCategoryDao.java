/*package myhealingbox.dao.day;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.day.DayCategory;
import myhealingbox.entity.night.Video;

public interface DayCategoryDao {



	@Select("select * from Note order by regDate desc" + 
	         "     limit ${(page-1)*15},15")

	List<DayCategory> getList();
	
	DayCategory get(Integer id);

	int insert(Video video);

}
*/