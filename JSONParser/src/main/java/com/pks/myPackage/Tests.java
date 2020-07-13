package com.pks.myPackage;

public class Tests {
	private String test_name;
	private int mark;
	
	public String getTest_name() {
		return test_name;
	}
	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Tests [test_name=" + test_name + ", mark=" + mark + "]";
	}
	
	

}
