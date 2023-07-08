package com.takeo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ENO")
	private int eno;
	
	@Column(name="FNAME")
	private String fname;
	
	@Column(name="LNAME")
	private String lname;
	
	@Column(name="EMAIL")
	private String email;
	
	
	
	
	public int getEno() {
		return eno;
	}




	public void setEno(int eno) {
		this.eno = eno;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int eno, String fname, String lname, String email) {
		super();
		this.eno = eno;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	
	

}
