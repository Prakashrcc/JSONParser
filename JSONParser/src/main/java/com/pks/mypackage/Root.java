package com.pks.mypackage;

import java.util.Arrays;

public class Root {
	private Student[] students;

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Root [students=" + Arrays.toString(students) + "]";
	}
	
}
