package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating a new student object...");
			Student tempStudent=new Student("Nabil","Mahtab","nabil2305mahtab@gmail.com");
			session.beginTransaction();
			System.out.println("saving the student...");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}

	}

}
