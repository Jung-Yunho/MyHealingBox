package myhealingbox.dao.mybatis.day;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.night.Video;

public interface MyBatisDayCategoryDao {

	/*@Select("select * from Note order by regDate desc" + 
	         "     limit ${(page-1)*15},15")
	List<Video> getList(@Param("page") Integer page);

	Video get(Integer id);

	int insert(Video video);*/

}
