package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="firstName")
	private String firstname;
	
	@Column(name="age")
	private int age;
	
	public Student() {}
	
	public Student(Long id, String firstName, int age) {
		this.id = id;
		this.firstname = firstName;
		this.age = age;
	}

	public Student(String firstName, int age) {
		this.firstname = firstName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getID() {
		return id;
	}
	
	

}
