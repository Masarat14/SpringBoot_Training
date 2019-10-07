package com.DependencyInjection;



public class Student {

	private String studentName;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void displayInfo()
	{
		System.out.println("The student name is"+ ":" + studentName );
	}
	
}
