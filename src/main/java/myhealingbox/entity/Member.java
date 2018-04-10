package myhealingbox.entity;

public class Member {

	private String id;
	private String name;
	private String pwd;
	private String photo;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String pwd, String photo) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.photo = photo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
