package myhealingbox.dao.mybatis.night;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.night.VideoDao;
import myhealingbox.entity.night.Video;

//구현체
public class MyBatisVideoDao implements VideoDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Video> getList(Integer page) {

		VideoDao videoDao = sqlSession.getMapper(VideoDao.class);

		List<Video> result = videoDao.getList(page);

		return result;
	}

	@Override
	public Video get(Integer id) {
		VideoDao videoDao = sqlSession.getMapper(VideoDao.class);

		Video result = videoDao.get(id);

		return result;
	}

	@Override
	public int insert(Video video) {
		VideoDao videoDao = sqlSession.getMapper(VideoDao.class);

		int result = videoDao.insert(video);

		return result;

	}

	@Override
	public List<Video> getFavoriteList(Integer page) {
		VideoDao videoDao = sqlSession.getMapper(VideoDao.class);

		List<Video> result = videoDao.getFavoriteList(page);

		return result;
	}

	@Override
	public int delete(Video video) {
		VideoDao videoDao = sqlSession.getMapper(VideoDao.class);
		
		int result = videoDao.delete(video);
		
		return result;
	}

}