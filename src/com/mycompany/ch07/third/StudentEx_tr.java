package com.mycompany.ch07.third;

public class StudentEx_tr {

	public static void main(String[] args) {
		Student student = new Student("Tony","26",22);
		
		System.out.println(student.name + " | " + student.ssn);
		student.sayName();

	}

}
