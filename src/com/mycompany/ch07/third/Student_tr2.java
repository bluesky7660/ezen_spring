package com.mycompany.ch07.third;

public class Student_tr2 extends People_tr2{
	public int studentNo;
	
	public Student_tr2(String name,String ssn,int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
	public Student_tr2(String name,String ssn) {
		super(name,ssn);
	}
	public Student_tr2() {
	}
	@Override
	void sayName() {
		if(studentNo >= 21) {
			super.sayName();
		} else {
			System.out.println("Student.tr2.name: " + name);
		}
		
	}
	
	
}
