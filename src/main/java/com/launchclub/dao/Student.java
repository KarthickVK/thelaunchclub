package com.launchclub.dao;

import javax.persistence.Column;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student" , uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class Student{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id")
	    private int id;

	    @Column(name = "Uname")
	    private String Uname;

	    @Column(name = "Password")
	    private String Password;

	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "Phone")
	    private float Phone;


	    public Student() {

	    }

	    public Student(String Uname, String Password, String email,float Phone) {
	        this.Uname = Uname;
	        this.Password = Password;
	        this.email = email;
	        this.Phone = Phone;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }


	    public String getUname() {
			return Uname;
		}

		public void setUname(String uname) {
			Uname = uname;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public float getPhone() {
			return Phone;
		}

		public void setPhone(float phone) {
			Phone = phone;
		}

		@Override
	    public String toString() {
	        return "Student [id=" + id + ",  Uname=" +  Uname + ", 	Password=" + 	Password + ",Phone=" + Phone + ",email=" + email + "]";
	    }
	}


