package com.launchclub;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.firstspring.dao.Student;
import com.spring.firstspring.dao.StudentDao;



@SpringBootApplication
public class FirstspringApplication {

	public static void main(String[] args) {
		
		 StudentDao studentDao = new StudentDao();
	        Student student = new Student("kowsi", "spaka", "kowsi@gmail.com",255808776);
	        studentDao.saveStudent(student);

	        List < Student > students = studentDao.getStudents();
	        students.forEach(s -> System.out.println(s.getUname()));
	}

}
