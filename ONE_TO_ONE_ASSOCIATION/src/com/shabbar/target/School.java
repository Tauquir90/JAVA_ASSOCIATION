package com.shabbar.target;

public class School {
	private String school_name;
	private int NO_OF_TEACHER;
	private int NO_OF_STUDENTS;
	private Teacher teacher;
	private Student student;
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public int getNO_OF_TEACHER() {
		return NO_OF_TEACHER;
	}
	public void setNO_OF_TEACHER(int nO_OF_TEACHER) {
		NO_OF_TEACHER = nO_OF_TEACHER;
	}
	public int getNO_OF_STUDENTS() {
		return NO_OF_STUDENTS;
	}
	public void setNO_OF_STUDENTS(int nO_OF_STUDENTS) {
		NO_OF_STUDENTS = nO_OF_STUDENTS;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void  schoolDetails()
	{
		System.out.println("School Details....");
		System.out.println("...............................");
		System.out.println("SCHOOL NAME :"+getSchool_name());
		System.out.println("NO OF TEACHER :"+getNO_OF_TEACHER());
		System.out.println("NO OF TEACHER :"+getNO_OF_STUDENTS());
		System.out.println("TEACHER DETAILs..................");
		System.out.println("................................");
		System.out.println("TEACHER NAME :"+teacher.getTeacherName());
		System.out.println("TEACHER AGE :"+teacher.getAge());
		System.out.println("TEACHER SALARY :"+teacher.getSalary());
		System.out.println("TEACHER QUALIFICATION :"+teacher.getQualification());
		System.out.println();
		System.out.println("STUDENT DETAILS...............");
		System.out.println("STUDENT NAME :"+student.getStudent_name());
		System.out.println("STUDENT STANDARD :"+student.getStandard());
		System.out.println("STUDENT FEES  :"+student.getFees());
		System.out.println("STUDENT ROLL :"+student.getRollNo());
		System.out.println("STUDENT CLASS TEACHER :"+student.getClassTeacher());
		
		
		
		
	}

}
