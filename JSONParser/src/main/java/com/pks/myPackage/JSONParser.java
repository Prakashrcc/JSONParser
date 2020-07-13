package com.pks.myPackage;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONParser {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper= new ObjectMapper();
		
		Root root=objectMapper.readValue(new File("C:\\Users\\Prakash\\Desktop\\example.json"),Root.class);
		System.out.println(root.toString());
		
		Students[] students=root.getStudents();
		Progressions[] progressions=students[0].getProgressions();
		Subjects[] subjects = progressions[0].getSubjects();
		Tests[] tests=subjects[0].getTests();
		// In this way any attribute can be read
		
		//These are just to check
		System.out.println(students[0].getName());
		
		for(int i=0;i<progressions.length;i++) {
		System.out.println(progressions[i].toString());
		}
		
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i].toString());
		}
		
		for(int i=0;i<subjects.length;i++) {
			System.out.println(tests[i].toString());
		}
		
	}

}
