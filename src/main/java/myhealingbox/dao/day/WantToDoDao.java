package myhealingbox.dao.day;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.day.WantToDo;
import myhealingbox.entity.night.Video;

public interface WantToDoDao {
	
	List<WantToDo> getList(@Param("page") Integer page);

	/*@Select("select * from Note order by regDate desc" + 
	         "     limit ${(page-1)*15},15")
	List<Video> getList(@Param("page") Integer page);

	Video get(Integer id);

	int insert(Video video);*/

}
