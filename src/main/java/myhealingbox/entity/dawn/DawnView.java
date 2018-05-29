package myhealingbox.entity.dawn;

import java.util.Date;

public class DawnView {

	private long MId;
	private String MMid;
	private String MPwd;
	private Date MRegDate;
	private long DCId;
	private String DCTitle; 
	private Date DCRegDate;
	private long DCMemberId;
	private long DMId;
	private String DMTitle;
	private String DMContent;
	private Date DMRegDate;
	private String DMAttachedFile;
	private long DMDawnCategoryId;
	
	public DawnView() {
		// TODO Auto-generated constructor stub
	}

	public DawnView(String mMid, String mPwd, String dCTitle, long dCMemberId, String dMTitle, String dMContent,
			String dMAttachedFile, long dMDawnCategoryId) {
		super();
		MMid = mMid;
		MPwd = mPwd;
		DCTitle = dCTitle;
		DCMemberId = dCMemberId;
		DMTitle = dMTitle;
		DMContent = dMContent;
		DMAttachedFile = dMAttachedFile;
		DMDawnCategoryId = dMDawnCategoryId;
	}

	public DawnView(String dCTitle, String dMTitle, String dMContent, String dMAttachedFile) {
		super();
		DCTitle = dCTitle;
		DMTitle = dMTitle;
		DMContent = dMContent;
		DMAttachedFile = dMAttachedFile;
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

	public long getDMId() {
		return DMId;
	}

	public void setDMId(long dMId) {
		DMId = dMId;
	}

	public String getDMTitle() {
		return DMTitle;
	}

	public void setDMTitle(String dMTitle) {
		DMTitle = dMTitle;
	}

	public String getDMContent() {
		return DMContent;
	}

	public void setDMContent(String dMContent) {
		DMContent = dMContent;
	}

	public Date getDMRegDate() {
		return DMRegDate;
	}

	public void setDMRegDate(Date dMRegDate) {
		DMRegDate = dMRegDate;
	}

	public String getDMAttachedFile() {
		return DMAttachedFile;
	}

	public void setDMAttachedFile(String dMAttachedFile) {
		DMAttachedFile = dMAttachedFile;
	}

	public long getDMDawnCategoryId() {
		return DMDawnCategoryId;
	}

	public void setDMDawnCategoryId(long dMDawnCategoryId) {
		DMDawnCategoryId = dMDawnCategoryId;
	}

	@Override
	public String toString() {
		return "DawnView [MId=" + MId + ", MMid=" + MMid + ", MPwd=" + MPwd + ", MRegDate=" + MRegDate + ", DCId="
				+ DCId + ", DCTitle=" + DCTitle + ", DCRegDate=" + DCRegDate + ", DCMemberId=" + DCMemberId + ", DMId="
				+ DMId + ", DMTitle=" + DMTitle + ", DMContent=" + DMContent + ", DMRegDate=" + DMRegDate
				+ ", DMAttachedFile=" + DMAttachedFile + ", DMDawnCategoryId=" + DMDawnCategoryId + "]";
	}
	
	
}
