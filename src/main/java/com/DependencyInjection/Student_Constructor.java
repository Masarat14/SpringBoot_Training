package com.DependencyInjection;

public class Student_Constructor {

	private int id;
	private String StudentName;
	
	//Constructors
	public Student_Constructor(int id){
		this.id=id;
		
	}
	public Student_Constructor(int id, String StudentName)
	{
		this.id=id;
		this.StudentName=StudentName;

	
	}
	
	public void displayInfo()
	{
		System.out.println("The student name is :"+ StudentName+ " and the id is"+ id);
		
	}
}


