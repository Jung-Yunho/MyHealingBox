package myhealingbox.dao.day;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import myhealingbox.entity.day.WantToDo;


public interface WantToDoDao {
	
	List<WantToDo> getList(@Param("page") Integer page);

	WantToDo get(Integer id);

	int insert(WantToDo wantToDo);

	/*@Select("select * from Note order by regDate desc" + 
	         "     limit ${(page-1)*15},15")
	List<Video> getList(@Param("page") Integer page);*/
}
