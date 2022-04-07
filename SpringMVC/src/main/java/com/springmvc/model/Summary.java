package com.springmvc.model;

public class Summary {

	private double renewal,newAdmission,oneDay,dueAmount,netTotal;
	private int memberCount;
	public Summary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getRenewal() {
		return renewal;
	}
	public void setRenewal(double renewal) {
		this.renewal = renewal;
	}
	public double getNewAdmission() {
		return newAdmission;
	}
	public void setNewAdmission(double newAdmission) {
		this.newAdmission = newAdmission;
	}
	public double getOneDay() {
		return oneDay;
	}
	public void setOneDay(double oneDay) {
		this.oneDay = oneDay;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public double getNetTotal() {
		return netTotal;
	}
	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	
	
}
