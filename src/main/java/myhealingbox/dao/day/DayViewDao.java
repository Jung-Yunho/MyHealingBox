package myhealingbox.dao.day;

import java.util.List;

import myhealingbox.entity.day.DayView;

public interface DayViewDao {

	List<DayView> getList(Integer id);

	DayView getDayViewTitle(Integer id);
	
	 

}
