package myhealingbox.entity.day;

import java.util.Date;

public class WantToDo {

	private long id;
	private String title;
	private String content;
	private Date regDate;
	private long dayCategoryId;

	public WantToDo() {

	}
	
	public WantToDo(String title, String content, long dayCategoryId) {
		this.title = title;
		this.content = content;
		this.dayCategoryId = dayCategoryId;
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

	public long getDayCategoryId() {
		return dayCategoryId;
	}

	public void setDayCategoryId(long dayCategoryId) {
		this.dayCategoryId = dayCategoryId;
	}

	@Override
	public String toString() {
		return "WantToDo [id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate
				+ ", dayCategoryId=" + dayCategoryId + "]";
	}

	
	
	
	
	
	
}
