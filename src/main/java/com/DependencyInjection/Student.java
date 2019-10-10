package com.DependencyInjection;



public class Student {

	private String studentName;
	private int id;
	
	

	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method for Id is invoked");
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter method for Name is invoked");
	}
	

	public void displayInfo()
	{
		System.out.println("The student name is"+ ":" + studentName );
		System.out.println("The id for the student is :"+ id);
	}
	
}
