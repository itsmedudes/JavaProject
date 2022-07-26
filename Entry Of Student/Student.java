package com.Iterable;

public class Student {
	private int roll;
	private int marks;
	private String name;
	
	
	Student(int roll, int marks, String name){
		this.roll=roll;
		this.marks = marks;
		this.name = name;
		
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
