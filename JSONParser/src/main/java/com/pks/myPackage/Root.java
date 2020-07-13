package com.pks.myPackage;

import java.util.Arrays;

public class Root {
	private Students[] students;

	public Students[] getStudents() {
		return students;
	}

	public void setStudents(Students[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Root [students=" + Arrays.toString(students) + "]";
	}
	
}
