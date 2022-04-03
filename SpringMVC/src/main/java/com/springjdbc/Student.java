package com.springjdbc;

public class Student {
private int sid;
private String city;
private String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String city, String name) {
	super();
	this.sid = sid;
	this.city = city;
	this.name = name;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", city=" + city + ", name=" + name + "]";
}

	
	
	
}
