package com.mycompany.ch07.third;

public class StudentEx_tr {

	public static void main(String[] args) {
		Student_tr student_tr = new Student_tr("Tony","26",22);
		
		System.out.println(student_tr.name + " | " + student_tr.ssn);
		student_tr.sayName();

	}

}
