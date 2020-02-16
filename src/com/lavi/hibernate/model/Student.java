package com.lavi.hibernate.model;

import java.util.*;

public class Student {

	private int sid;
	private String sname;
	private String dob;
	private String qualification;
	private String courses[];
	private List<String> emails;
	private List<String> marks;
	private Set<String> phones;
	private Map<String,Long> refs;
	
	public Student(){}
	
	public Student(String sname, String dob, String qualification, String[] courses, List<String> emails,
			List<String> marks, Set<String> phones, Map<String, Long> refs) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<String> getMarks() {
		return marks;
	}
	public void setMarks(List<String> marks) {
		this.marks = marks;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, Long> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}
	
	
	
}
