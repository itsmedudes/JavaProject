package com.Iterable;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> a = new ArrayList<>();
		
		
		int count =1;
		try {
		while(true) {
			System.out.println("Total Entry of Student"+ count);
			
			System.out.println("Enter the Name: ");
			String name = sc.next();
			
			System.out.println("Enter the Roll No : ");
			int roll = sc.nextInt();
			
			System.out.println("Enter the Marks : ");
			int marks = sc.nextInt();
			
			
			a.add(new Student(roll,marks,name));
			
			System.out.println("Add More Y/N");
			String choose = sc.next();
			
			if(choose.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		
		System.out.println("Student Details are :");
		System.out.println("=======================");
		
		for(int i =0;i<a.size();i++) {
			
			Student stu = (Student)a.get(i);
			
			System.out.println("Student Name : "+stu.getName());
			System.out.println("Roll No : "+stu.getRoll());
			System.out.println("Get Marks : "+stu.getMarks());
			
			System.out.println("*********************");
		}
		}
		catch(Exception e) {
			System.out.println("Opps Wrong Input");
		}
	}
}
