package com.mycompany.ch07.third;

public class Student_tr extends People{
	public int studentNo;
	
	public Student_tr(String name,String ssn,int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
	public Student_tr(String name,String ssn) {
		super(name,ssn);
	}
	public Student_tr() {
	}
	@Override
	void sayName() {
		if(studentNo >= 21) {
			super.sayName();
		} else {
			System.out.println("Student.tr.name: " + name);
		}
		
	}
	
	
}
