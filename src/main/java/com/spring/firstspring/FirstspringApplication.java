package com.spring.firstspring;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.firstspring.dao.StudentDao;
import com.spring.firstspring.entity.Student;



@SpringBootApplication
public class FirstspringApplication {

	public static void main(String[] args) {
		 StudentDao studentDao = new StudentDao();
	        Student student = new Student("kowsi", "spaka", "rameshfadatare@javaguides.com");
	        studentDao.saveStudent(student);

	        List < Student > students = studentDao.getStudents();
	        students.forEach(s -> System.out.println(s.getFirstName()));
	}

}
