package com.cisc181.core;

import java.util.UUID;

/**
 * CourseID (UUID), CourseName (String). GradePoints(int)
 * 
 * @author 0
 *
 */
public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	

	public Course(String courseName, int gradePoints) {
		super();
		CourseName = courseName;
		GradePoints = gradePoints;
		CourseID = UUID.randomUUID();
	}

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

}
