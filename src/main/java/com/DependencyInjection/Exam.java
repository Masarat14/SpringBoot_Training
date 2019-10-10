package com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student std= context.getBean("student",Student.class);
		std.displayInfo();
		Student john = context.getBean("student1",Student.class);
		john.displayInfo();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_constructor.xml");
		Student_Constructor SC = context.getBean("student2",Student_Constructor.class);
		SC.displayInfo();
		
			
		
		
		
	}

}
