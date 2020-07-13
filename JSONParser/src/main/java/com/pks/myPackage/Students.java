package com.pks.myPackage;

import java.util.Arrays;

public class Students {
	private String name;
	private  String phone;
	private String email;
	private String father_name;
	private String mother_name;
	private Progressions[] progressions;
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
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public Progressions[] getProgressions() {
		return progressions;
	}
	public void setProgressions(Progressions[] progressions) {
		this.progressions = progressions;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", phone=" + phone + ", email=" + email + ", father_name=" + father_name
				+ ", mother_name=" + mother_name + ", progressions=" + Arrays.toString(progressions) + "]";
	}
	

}
