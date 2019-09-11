package com.concretepage.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student1")
public class Student implements Serializable { 

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
    private int id;  

	@Column(name="student_name")
	private String name;
	
	@Column(name="college")
	private String college;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
} 

