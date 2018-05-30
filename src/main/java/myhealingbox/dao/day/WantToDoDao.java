package myhealingbox.dao.day;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import myhealingbox.entity.day.WantToDo;


public interface WantToDoDao {
	
	/*List<WantToDo> getList(Integer id);*/

	WantToDo get(Integer id);

	int insert(WantToDo wantToDo);

	int delete(Integer id);

	

	/*@Select("select * from Note order by regDate desc" + 
	         "     limit ${(page-1)*15},15");*/
}
