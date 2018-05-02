package myhealingbox.service.night;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myhealingbox.dao.night.VideoDao;
import myhealingbox.entity.night.NightCategory;
import myhealingbox.entity.night.Video;

public class VideoService {

	@Autowired
	private VideoDao videoDao;

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
			} else
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
}
