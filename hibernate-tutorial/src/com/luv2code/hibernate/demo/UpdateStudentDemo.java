package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		
		try {
			int studentId=4;
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			Student myStudent = session.get(Student.class,studentId);
			myStudent.setFirstName("Scooby");
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
