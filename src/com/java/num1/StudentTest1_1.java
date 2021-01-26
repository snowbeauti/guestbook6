package com.java.num1;

public class StudentTest1_1 {

	public static void main(String[] args) {
		Student_1 studentLee = new Student_1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student_1 studentSon = new Student_1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		//System.out.println(((Student) studentSon).serialNum);
		System.out.println(studentLee.serialNum);

	}

}
