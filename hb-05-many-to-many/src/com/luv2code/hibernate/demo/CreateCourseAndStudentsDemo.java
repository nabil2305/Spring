package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			Course tempCourse=new Course("PACMAn-How to score 1 million points");
			System.out.println("saving the course");
			session.save(tempCourse);
			System.out.println("saved the course "+tempCourse);
			Student tempStudent1=new Student("Nabil","Mahtab","nm@gmail.com");
			Student tempStudent2=new Student("Rorona","Zoro","rz@gmail.com");
			Student tempStudent3=new Student("Monkey.D","Luffy","pk@gmail.com");
			tempCourse.addStudents(tempStudent1);
			tempCourse.addStudents(tempStudent2);
			tempCourse.addStudents(tempStudent3);
			System.out.println("saving students");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			System.out.println("saved students"+tempCourse.getStudents());
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			factory.close();
		}

	}

}
