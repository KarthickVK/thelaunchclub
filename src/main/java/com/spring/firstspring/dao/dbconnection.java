package com.spring.firstspring.dao;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;



public class dbconnection {
	 private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                Configuration configuration = new Configuration();

	                
	                Properties settings = new Properties();
	                settings.put(Environment.DRIVER, "org.postgresql.Driver");
	                settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/thelaunchclub");
	                settings.put(Environment.USER, "root");
	                settings.put(Environment.PASS, "root");
	                

	                settings.put(Environment.SHOW_SQL, "true");

	                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

	                settings.put(Environment.HBM2DDL_AUTO, "create-drop");

	                configuration.setProperties(settings);

	                configuration.addAnnotatedClass(Student.class);

	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();

	                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return sessionFactory;
	    }

}
