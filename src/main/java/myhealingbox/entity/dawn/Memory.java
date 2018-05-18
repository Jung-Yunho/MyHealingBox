package myhealingbox.entity.dawn;

import java.util.Date;

public class Memory {

	private long id;
	private String title;
	private String content;
	private Date regDate;
	private String attachedFile;
	private long dawnCategoryId;
	
	public Memory() {

	}

	public Memory(String title, String content, String attachedFile, int check) {
		super();
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
	}


	public long getDawnCategoryId() {
		return dawnCategoryId;
	}

	public void setDawnCategoryId(long dawnCategoryId) {
		this.dawnCategoryId = dawnCategoryId;
	}

	@Override
	public String toString() {
		return "Memory [id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate
				+ ", attachedFile=" + attachedFile + ", dawnCategoryId=" + dawnCategoryId + "]";
	}

	
	
}
