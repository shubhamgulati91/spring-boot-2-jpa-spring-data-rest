package com.example.springboot.jpa.spring.data.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String passportNumber;
	
	public Student() {
		super();
	}
	
	public Student(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassportNumber() {
		return passportNumber;
	}
	
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
	}
}