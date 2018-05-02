package myhealingbox.entity.night;

import java.util.Date;

public class Video {
	
	private int id;
	private String title;
	private String urlPath;
	private String content;
	private Date regDate;
	private int hit;
	private int nightCategoryId;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String title, String urlPath, String content) {
		this.title = title;
		this.urlPath = urlPath;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getNightCategoryId() {
		return nightCategoryId;
	}

	public void setNightCategoryId(int nightCategoryId) {
		this.nightCategoryId = nightCategoryId;
	}
	
	
	

}