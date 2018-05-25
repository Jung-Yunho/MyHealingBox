package myhealingbox.dao.day;

import java.util.List;

import myhealingbox.entity.day.DayCategory;

public interface DayCategoryDao {

	List<DayCategory> getList();
	
	DayCategory get(Integer id);
	
	int insert(DayCategory dayCategory);


}
