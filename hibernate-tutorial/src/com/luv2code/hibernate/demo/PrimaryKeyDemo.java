package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {


		public static void main(String[] args) {
			
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
			
			
			Session session = factory.getCurrentSession();
			
			try {
				System.out.println("Creating a new student object...");
				Student tempStudent1=new Student("Roronoa","Zoro","rz@gmail.com");
				Student tempStudent2=new Student("Monkey","D Luffy","mkd@gmail.com");
				Student tempStudent3=new Student("Nami","K","nmk@gmail.com");
				session.beginTransaction();
				System.out.println("saving the student...");
				session.save(tempStudent1);
				session.save(tempStudent2);
				session.save(tempStudent3);
				session.getTransaction().commit();
				System.out.println("done");
			}
			finally {
				factory.close();
			}

		}

	}

