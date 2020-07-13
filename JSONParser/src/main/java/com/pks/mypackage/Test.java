package com.pks.mypackage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {
	@JsonProperty("test_name")
	private String testName;
	private int mark;
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Test [testName=" + testName + ", mark=" + mark + "]";
	}
	
	
	

}
