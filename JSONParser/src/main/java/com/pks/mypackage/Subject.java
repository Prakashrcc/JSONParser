package com.pks.mypackage;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {
	@JsonProperty("subject_name")
	private String subjectName;
	private Test[] tests;
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubject_name(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public Test[] getTests() {
		return tests;
	}
	
	public void setTests(Test[] tests) {
		this.tests = tests;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", tests=" + Arrays.toString(tests) + "]";
	}

	
	
	

}
