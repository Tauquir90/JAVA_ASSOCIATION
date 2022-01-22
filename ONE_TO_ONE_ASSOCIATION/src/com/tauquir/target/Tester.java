package com.tauquir.target;


import com.shabbar.target.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setAge(38);
		teacher.setQualification("B.E in E.C.E");
		teacher.setSalary(60000.9);
		teacher.setTeacherName("Tauquir");
		
		Student student = new Student();
		student.setFees(3400.0);
		student.setClassTeacher("Tauquir");
		student.setStandard(12);
		student.setStudent_name("Shabbar");
		student.setRollNo(34);
		
		School school = new School();
		school.setNO_OF_STUDENTS(4000);
		school.setNO_OF_TEACHER(20);
		school.setSchool_name("ctks");
		school.setStudent(student);
		school.setTeacher(teacher);
		school.schoolDetails();
				

	}

}


