package myhealingbox.entity.day;

import java.util.Date;

public class WantToDo {

	private long id;
	private String title;
	private String content;
	private String attachedFile;
	private Date regDate;
	private long dayCategoryId;

	public WantToDo() {

	}
	
	public WantToDo(String title, String content, String attachedFile) {
		this.title = title;
		this.content = content;
		this.attachedFile = attachedFile;
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

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
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
		return "WantToDo [id=" + id + ", title=" + title + ", content=" + content + ", attachedFile=" + attachedFile
				+ ", regDate=" + regDate + ", dayCategoryId=" + dayCategoryId + "]";
	}

	
	
	
	
	
}
