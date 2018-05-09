package myhealingbox.dao.night;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import myhealingbox.entity.night.Video;

public interface VideoDao {

	@Select("select * from PrivateVideo order by regDate desc" + 
	         "     limit ${(page-1)*10},10")
	List<Video> getList(@Param("page") Integer page);
	
	@Select("select * from PrivateVideo order by hit desc" + 
	         "     limit ${(page-1)*10},10")
	List<Video> getFavoriteList(@Param("page") Integer page);

	Video get(Integer id);

	int insert(Video video);

	/*List<Video> getUrlList(Integer id);*/

}
