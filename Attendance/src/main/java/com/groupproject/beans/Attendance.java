package com.groupproject.beans;

public class Attendance {

	private int aid;
	private int memberId;
	private String attendanceDate;
	private String checkinTime;
	private String workoutTime;
	private String checkoutTime;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public String getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}
	public String getWorkoutTime() {
		return workoutTime;
	}
	public void setWorkoutTime(String workoutTime) {
		this.workoutTime = workoutTime;
	}
	public String getCheckoutTime() {
		return checkoutTime;
	}
	public void setCheckoutTime(String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	
}
