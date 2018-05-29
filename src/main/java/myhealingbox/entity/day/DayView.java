package myhealingbox.entity.day;

import java.util.Date;

public class DayView {

	private long MId;
	private String MMid;
	private String MPwd;
	private Date MRegDate;
	private long DCId;
	private String DCTitle;
	private Date DCRegDate;
	private long DCMemberId;
	private long WTDId;
	private String WTDTitle;
	private String WTDcontent;
	private Date WTDRegDate;
	private long WTDDayCategoryId;

	public DayView() {
		// TODO Auto-generated constructor stub
	}

	public DayView(String dCTitle, String wTDTitle, String wTDcontent) {
		
		DCTitle = dCTitle;
		WTDTitle = wTDTitle;
		WTDcontent = wTDcontent;
	}

	public long getMId() {
		return MId;
	}

	public void setMId(long mId) {
		MId = mId;
	}

	public String getMMid() {
		return MMid;
	}

	public void setMMid(String mMid) {
		MMid = mMid;
	}

	public String getMPwd() {
		return MPwd;
	}

	public void setMPwd(String mPwd) {
		MPwd = mPwd;
	}

	public Date getMRegDate() {
		return MRegDate;
	}

	public void setMRegDate(Date mRegDate) {
		MRegDate = mRegDate;
	}

	public long getDCId() {
		return DCId;
	}

	public void setDCId(long dCId) {
		DCId = dCId;
	}

	public String getDCTitle() {
		return DCTitle;
	}

	public void setDCTitle(String dCTitle) {
		DCTitle = dCTitle;
	}

	public Date getDCRegDate() {
		return DCRegDate;
	}

	public void setDCRegDate(Date dCRegDate) {
		DCRegDate = dCRegDate;
	}

	public long getDCMemberId() {
		return DCMemberId;
	}

	public void setDCMemberId(long dCMemberId) {
		DCMemberId = dCMemberId;
	}

	public long getWTDId() {
		return WTDId;
	}

	public void setWTDId(long wTDId) {
		WTDId = wTDId;
	}

	public String getWTDTitle() {
		return WTDTitle;
	}

	public void setWTDTitle(String wTDTitle) {
		WTDTitle = wTDTitle;
	}

	public String getWTDcontent() {
		return WTDcontent;
	}

	public void setWTDcontent(String wTDcontent) {
		WTDcontent = wTDcontent;
	}

	public Date getWTDRegDate() {
		return WTDRegDate;
	}

	public void setWTDRegDate(Date wTDRegDate) {
		WTDRegDate = wTDRegDate;
	}

	public long getWTDDayCategoryId() {
		return WTDDayCategoryId;
	}

	public void setWTDDayCategoryId(long wTDDayCategoryId) {
		WTDDayCategoryId = wTDDayCategoryId;
	}

	@Override
	public String toString() {
		return "DayView [MId=" + MId + ", MMid=" + MMid + ", MPwd=" + MPwd + ", MRegDate=" + MRegDate + ", DCId=" + DCId
				+ ", DCTitle=" + DCTitle + ", DCRegDate=" + DCRegDate + ", DCMemberId=" + DCMemberId + ", WTDId="
				+ WTDId + ", WTDTitle=" + WTDTitle + ", WTDcontent=" + WTDcontent + ", WTDRegDate=" + WTDRegDate
				+ ", WTDDayCategoryId=" + WTDDayCategoryId + "]";
	}
	
	
}
