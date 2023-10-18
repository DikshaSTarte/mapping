package com.MappingEX.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int lapId;
	private String mobileno;
	private String emailId;
	
	@OneToOne
	@JoinColumn(name = "studentId")
	private Student student;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String mobileno, String emailId) {
		super();
		this.mobileno = mobileno;
		this.emailId = emailId;
	}
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
		
}

