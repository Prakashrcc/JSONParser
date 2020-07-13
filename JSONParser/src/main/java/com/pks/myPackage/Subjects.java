package com.pks.myPackage;

import java.util.Arrays;

public class Subjects {
	private String subject_name;
	private Tests[] tests;
	
	public String getSubject_name() {
		return subject_name;
	}
	
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	public Tests[] getTests() {
		return tests;
	}
	
	public void setTests(Tests[] tests) {
		this.tests = tests;
	}

	@Override
	public String toString() {
		return "Subjects [subject_name=" + subject_name + ", tests=" + Arrays.toString(tests) + "]";
	}
	
	
	

}
