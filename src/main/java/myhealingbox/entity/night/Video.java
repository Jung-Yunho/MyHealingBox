package myhealingbox.entity.night;

import java.util.Date;

public class Video {
	
	private long id;
	private String title;
	private String urlPath;
	private String content;
	private Date regDate;
	private int hit;
	private long nightCategoryId;
	
	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String title, String urlPath, String content) {
		this.title = title;
		this.urlPath = urlPath;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getNightCategoryId() {
		return nightCategoryId;
	}

	public void setNightCategoryId(long nightCategoryId) {
		this.nightCategoryId = nightCategoryId;
	}

	
	
	

}