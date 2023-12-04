package com.arun.HibernateThird;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="STUDENT")
public class Student 
{
	@Id
	@Column(name="ROLL")
	private int roll;
	
	@Column(name="NAME")
	private String name;
	
	public Student()
	{
		System.out.println("Student Object is Created");
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
}