package com.pks.mypackage;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Progression {
	@JsonProperty("roll_no")
	private String rollNo;
	
	@JsonProperty("class_name")
	private String className;
	
	private String section;
	
	@JsonProperty("school_name")
	private String schoolName;
	
	@JsonProperty("joining_date")
	private String joiningDate;
	
	@JsonProperty("ending_date")
	private String endingDate;
	
	private Subject[] subjects;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}

	public Subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Progression [rollNo=" + rollNo + ", className=" + className + ", section=" + section + ", schoolName="
				+ schoolName + ", joiningDate=" + joiningDate + ", endingDate=" + endingDate + "]";
	}
	
	
	

}
