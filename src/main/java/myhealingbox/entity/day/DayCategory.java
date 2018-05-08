package myhealingbox.entity.day;

import java.util.Date;

public class DayCategory {
	
	private long id;
	private String title;
	private Date regDate;
	private long memberId;
	
	public DayCategory() {

	}
	
	public DayCategory(String title) {
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

	@Override
	public String toString() {
		return "DayCategory [id=" + id + ", title=" + title + ", regDate=" + regDate + ", memberId=" + memberId + "]";
	}
		
	
	
}
