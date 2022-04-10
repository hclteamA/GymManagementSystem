package com.springmvc.model;

import javax.persistence.Entity;

@Entity
public class User1 {

	private String mId;
	private String fname;
	private String lname;
	private int mobile;
	private String email;
	private String gender; 
	private String address;
	private String embp;
	private int embpm;
	private String pack;
	private String medical;
	
	public User1(String mId, String fname, String lname, int mobile, String email, String gender, String address,
			String embp, int embpm, String pack, String medical) {
		super();
		this.mId = mId;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.embp = embp;
		this.embpm = embpm;
		this.pack = pack;
		this.medical = medical;
	}

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmbp() {
		return embp;
	}

	public void setEmbp(String embp) {
		this.embp = embp;
	}

	public int getEmbpm() {
		return embpm;
	}

	public void setEmbpm(int embpm) {
		this.embpm = embpm;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public String getMedical() {
		return medical;
	}

	public void setMedical(String medical) {
		this.medical = medical;
	}

	@Override
	public String toString() {
		return "User1 [mId=" + mId + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", email=" + email
				+ ", gender=" + gender + ", address=" + address + ", embp=" + embp + ", embpm=" + embpm + ", pack="
				+ pack + ", medical=" + medical + "]";
	}
	
	
}
