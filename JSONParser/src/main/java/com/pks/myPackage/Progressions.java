package com.pks.myPackage;

import java.util.Arrays;

public class Progressions {
	private String roll_no;
	private String class_name;
	private String section;
	private String school_name;
	private String joining_date;
	private String ending_date;
	private Subjects[] subjects;
	
	public String getRoll_no() {
		return roll_no;
	}
	
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getClass_name() {
		return class_name;
	}
	
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	
	public String getSection() {
		return section;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getEnding_date() {
		return ending_date;
	}
	public void setEnding_date(String ending_date) {
		this.ending_date = ending_date;
	}
	public Subjects[] getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects[] subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Progressions [roll_no=" + roll_no + ", class_name=" + class_name + ", section=" + section
				+ ", school_name=" + school_name + ", joining_date=" + joining_date + ", ending_date=" + ending_date
				+ ", subjects=" + Arrays.toString(subjects) + "]";
	}
	

}
