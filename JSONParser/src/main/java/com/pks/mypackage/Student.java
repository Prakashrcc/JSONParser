package com.pks.mypackage;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	private String name;
	private  String phone;
	private String email;
	
	@JsonProperty("father_name")
	private String fatherName;
	
	@JsonProperty("mother_name")
	private String motherName;
	
	private Progression[] progressions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Progression[] getProgressions() {
		return progressions;
	}

	public void setProgressions(Progression[] progressions) {
		this.progressions = progressions;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", email=" + email + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", progressions=" + Arrays.toString(progressions) + "]";
	}
	
	

}
