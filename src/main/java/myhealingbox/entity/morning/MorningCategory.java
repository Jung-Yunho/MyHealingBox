package myhealingbox.entity.morning;

import java.util.Date;

public class MorningCategory {
	private long id;
	private String title;
	private int check;
	private Date regDate; 
	
	public MorningCategory() {
		
	}
	
	public MorningCategory(long id, String title, int check, Date regDate) {
		this.id = id;
		this.title = title;
		this.check = check;
		this.regDate = regDate;
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

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
