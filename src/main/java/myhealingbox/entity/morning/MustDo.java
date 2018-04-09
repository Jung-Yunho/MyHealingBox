package myhealingbox.entity.morning;

import java.util.Date;

public class MustDo {
	private String id;
	private String title;
	private String content;
	private Date regDate;
	private String attachedFile;
	private int check;
	private int desperateCheck;
	private Date deadline;
	
	public MustDo() {
		
	}
	
	public MustDo(String id, String title, String content, Date regDate, String attachedFile, int check,
			int desperateCheck, Date deadline) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.attachedFile = attachedFile;
		this.check = check;
		this.desperateCheck = desperateCheck;
		this.deadline = deadline;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public int getDesperateCheck() {
		return desperateCheck;
	}

	public void setDesperateCheck(int desperateCheck) {
		this.desperateCheck = desperateCheck;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
}
