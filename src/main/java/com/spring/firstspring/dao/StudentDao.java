package com.spring.firstspring.dao;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.spring.firstspring.entity.Student;

import com.spring.firstspring.util.dbconnection;


public class StudentDao {
	  public void saveStudent(Student student) {
	        Transaction transaction = null;
	        try (Session session = dbconnection.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(student);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    public List < Student > getStudents() {
	        try (Session session = dbconnection.getSessionFactory().openSession()) {
	            return session.createQuery("from Student", Student.class).list();
	        }
	    }
	}


