package com.xiaodai.bean;

import java.sql.Timestamp;
import java.util.Date;

public class LoanInfoBean {
	private int id;
	private String websiteName;
	private String tabName;
	private String loanType;
	private String title;
	private String obligorId;
	private int money;
	private int durationMonths;
	private double yearInterestRate;
	private double bonusRate;
	private double progress;
	private Date bidEndTime;
	private String repaymentMode;
	private String loanStatus;
	private String loanDetail;
	private Timestamp snapshotTime;
	private String detailURL;
	private String comment;
	
	private double yearIncomeRate;
	private double monthInterestRate;
	private double managementRate;
	private int durationDays;
	public int getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}
	public double getYearIncomeRate() {
		return yearIncomeRate;
	}
	public void setYearIncomeRate(double yearIncomeRate) {
		this.yearIncomeRate = yearIncomeRate;
	}
	public double getMonthInterestRate() {
		return monthInterestRate;
	}
	public void setMonthInterestRate(double monthInterestRate) {
		this.monthInterestRate = monthInterestRate;
	}
	public double getManagementRate() {
		return managementRate;
	}
	public void setManagementRate(double managementRate) {
		this.managementRate = managementRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	public String getTabName() {
		return tabName;
	}
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getObligorId() {
		return obligorId;
	}
	public void setObligorId(String obligorId) {
		this.obligorId = obligorId;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDurationMonths() {
		return durationMonths;
	}
	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}
	public double getYearInterestRate() {
		return yearInterestRate;
	}
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	public double getBonusRate() {
		return bonusRate;
	}
	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public Date getBidEndTime() {
		return bidEndTime;
	}
	public void setBidEndTime(Date bidEndTime) {
		this.bidEndTime = bidEndTime;
	}
	public String getRepaymentMode() {
		return repaymentMode;
	}
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getLoanDetail() {
		return loanDetail;
	}
	public void setLoanDetail(String loanDetail) {
		this.loanDetail = loanDetail;
	}
	public Date getSnapshotTime() {
		return snapshotTime;
	}
	public void setSnapshotTime(Timestamp snapshotTime) {
		this.snapshotTime = snapshotTime;
	}
	public String getDetailURL() {
		return detailURL;
	}
	public void setDetailURL(String detailURL) {
		this.detailURL = detailURL;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
