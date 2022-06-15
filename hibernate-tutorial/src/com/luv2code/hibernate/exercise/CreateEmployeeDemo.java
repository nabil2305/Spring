package com.luv2code.hibernate.exercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateEmployeeDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating a new student object...");
			Employee tempEmployee=new Employee("Nabil","Mahtab","epsilon");
			session.beginTransaction();
			System.out.println("saving the student...");
			session.save(tempEmployee);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}

	}

}
