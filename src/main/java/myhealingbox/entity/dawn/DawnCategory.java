package myhealingbox.entity.dawn;

import java.util.Date;

public class DawnCategory {

	private long id;
	private String title;
	private Date regDate;
	private long memberId;
	
	public DawnCategory() {
		
	}

	public DawnCategory(String title) {
		super();
		this.title = title;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	
}
