package com.pavana.model;

import java.util.List;
import java.util.Set;

public class Student {
	
	private String course;
	private String subjects;
	
	
	
	public Student(String course, String subjects) {
		super();
		this.course = course;
		this.subjects = subjects;
	}
	/*public void setCourse(String course) {
		this.course = course;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}*/
	@Override
	public String toString() {
		return "Student [course=" + course + ", subjects=" + subjects + "]";
	}
	
	
	
	

}
