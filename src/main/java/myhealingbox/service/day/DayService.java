package myhealingbox.service.day;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;

import myhealingbox.dao.day.DayCategoryDao;
import myhealingbox.dao.day.WantToDoDao;
import myhealingbox.dao.night.VideoDao;
import myhealingbox.entity.day.DayCategory;
import myhealingbox.entity.night.Video;

public class DayService {

	@Autowired
	private WantToDoDao wantToDoDao;
	@Autowired
	private DayCategoryDao dayCategoryDao;
	
	
	public List<Video> getVideoList(int page) {
		List<Video> list = videoDao.getList(page);

	      // html parse는 service에서
	      for (Video n : list) {
	         String content = n.getContent();

	         if (content == null)
	            continue;

	         Document doc = Jsoup.parse(content);
	         String text = doc.text(); // html content에서 tag를 뺀 text만 추출
	         Element img = doc.select("img").first();

	         if (text.length() > 250)
	            text = text.substring(0, 249);

	         if (img != null) {
	            n.setContent(img.toString() + text);
	         } 
	         else
	            n.setContent(text);

	      }

	      return list;
	}

	public Video getVideo(Integer id) {
		Video video = videoDao.get(id);

	      return video;
	}

	public int insertVideo(Video video) {
		
		videoDao.insert(video);
		return 0;
	}

	public List<DayCategory> getDayCategoryList(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
