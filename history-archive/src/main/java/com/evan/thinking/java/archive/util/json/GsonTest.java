package com.evan.thinking.java.archive.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.evan.thinking.java.archive.util.json.model.Student;

public class GsonTest {

	public static void main(String[] args){
		Student student = new Student();
		student.setId(12);
		student.setAge(35);
		student.setName(null);
		Gson gson = new GsonBuilder().registerTypeAdapter(String.class, new GsonStringConverter()).create();
		System.out.println(gson.toJson(student,Student.class  ));
	}
}
