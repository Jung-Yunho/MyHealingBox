package myhealingbox.dao.day;

import java.util.List;

import myhealingbox.entity.day.DayCategory;

public interface DayCategoryDao {

	List<DayCategory> getList();
	
	DayCategory get(Integer id);
	
	/*	String getTitle(String title);*/
	
	int insert(DayCategory dayCategory);



	/*@Select("select * from Note order by regDate desc" + 
    "     limit ${(page-1)*15},15")*/
}
