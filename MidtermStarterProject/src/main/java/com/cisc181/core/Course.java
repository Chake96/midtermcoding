package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}	
	
	public void setEmajor(eMajor major){
		this.Major = major;
	}
	
	public eMajor getEmajor(){ //double check
		return Major;
	}
	
	public Course(){
		
	}
	
	public Course(UUID courseid, String coursename, int gradepoints){
		this.CourseID = courseid;
		this.CourseName = coursename;
		this.GradePoints = gradepoints;
	}

}
