package com.launchclub.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try (Session session = dbconnection.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(student);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Student> getStudents() {
		try (Session session = dbconnection.getSessionFactory().openSession()) {
			return session.createQuery("from Student", Student.class).list();
		}
	}
}
