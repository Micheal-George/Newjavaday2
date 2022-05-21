package com.masai;

public class StudentDetails {

	
	int roll;
	String Name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll No is : "+roll);
		System.out.println("Name is :"+ Name);
		System.out.println("Marks is :"+marks);
	}
	
	public static void main(String[] args) {
		
		StudentDetails s1=new StudentDetails();
		s1.roll=20;
		s1.Name="Micheal";
		s1.marks=50;
		s1.displayStudentDetails();
		
		System.out.println("=================");
		
		StudentDetails s2=new StudentDetails();
		s2.roll=25;
		s2.Name="Shameem";
		s2.marks=55;
		s2.displayStudentDetails();
		
	}
}
