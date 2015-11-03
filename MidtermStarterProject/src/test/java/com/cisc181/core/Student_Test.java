package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {



	@BeforeClass
	public static void setupOnce() throws Exception{
		Date date;
		Date startFall;
		Date endFall;
		Date startSpring;
		Date endSpring;
		date = new SimpleDateFormat("yyyy-MM-dd").parse("1996-04-09");
		startFall = new SimpleDateFormat("yyyy-MM-dd").parse("2015-09-06");
		endFall = new SimpleDateFormat("yyyy-MM-dd").parse("2015-012-06");
		startSpring = new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-02");
		endSpring = new SimpleDateFormat("yyyy-MM-dd").parse("2015-05-30");

		Course cisc = new Course(UUID.randomUUID(),"CISC181", 100);
		Course antho = new Course(UUID.randomUUID(),"ANTHO101", 100);
		Course math = new Course(UUID.randomUUID(),"MATH210", 100);

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(cisc);
		courses.add(antho);
		courses.add(math);


		ArrayList<Semester> semesters = new ArrayList<Semester>();
		Semester fall = new Semester(UUID.randomUUID(), startFall, endFall);
		Semester spring = new Semester(UUID.randomUUID(), startSpring, endSpring);
		semesters.add(fall);
		semesters.add(spring);

		ArrayList<Section> sections = new ArrayList<Section>();
		Section ciscone = new Section(cisc.getCourseID(),fall.getSemesterID(),UUID.randomUUID(), 10);
		Section cisctwo = new Section(cisc.getCourseID(),spring.getSemesterID(),UUID.randomUUID(), 20);
		Section anthoone = new Section(antho.getCourseID(),fall.getSemesterID(),UUID.randomUUID(), 10);
		Section anthotwo = new Section(antho.getCourseID(),spring.getSemesterID(),UUID.randomUUID(), 20);
		Section mathone = new Section(math.getCourseID(),fall.getSemesterID(),UUID.randomUUID(), 10);
		Section mathtwo = new Section(math.getCourseID(),spring.getSemesterID(),UUID.randomUUID(), 20);
		sections.add(ciscone);
		sections.add(cisctwo);
		sections.add(mathone);
		sections.add(mathtwo);
		sections.add(anthoone);
		sections.add(anthotwo);


		ArrayList<Student> stus = new ArrayList<Student>();
		Student carson = new Student("Carson", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com", UUID.randomUUID());
		Student kevin = new Student("kevin", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student mike = new Student("mike", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student joe = new Student("joe", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student roger = new Student("roger", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student john = new Student("john", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student bob = new Student("bob", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student deo = new Student("deo", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student rick = new Student("rick", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());
		Student nate = new Student("nate", "Doyle", "Hake", date, eMajor.COMPSI, "36 Prospect Ave", "(908)902 2357", "carsonhake@gmail.com",UUID.randomUUID());


		Enrollment ecarson = new Enrollment(carson.getStudentId(),ciscone.getSectionID());
		Enrollment ekevin = new Enrollment(kevin.getStudentId(),cisctwo.getSectionID());
		Enrollment emike = new Enrollment(mike.getStudentId(),anthoone.getSectionID());
		Enrollment ejoe = new Enrollment(joe.getStudentId(),anthotwo.getSectionID());
		Enrollment eroger = new Enrollment(roger.getStudentId(),mathone.getSectionID());
		Enrollment ejohn = new Enrollment(john.getStudentId(),mathtwo.getSectionID());
		Enrollment ebob = new Enrollment(bob.getStudentId(),ciscone.getSectionID());
		Enrollment edeo = new Enrollment(deo.getStudentId(),cisctwo.getSectionID());
		Enrollment erick = new Enrollment(rick.getStudentId(),mathone.getSectionID());
		Enrollment enate = new Enrollment(nate.getStudentId(),mathtwo.getSectionID());

		ecarson.setGrade(10);
		ekevin.setGrade(20);
		ejoe.setGrade(30);
		eroger.setGrade(40);
		ejohn.setGrade(50);
		ebob.setGrade(60);
		edeo.setGrade(70);
		erick.setGrade(80);
		emike.setGrade(90);
		enate.setGrade(100);



	} 



	@Test
	public void testGPA(){
		

	}

}
