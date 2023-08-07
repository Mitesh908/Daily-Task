package com.mit.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
//@Table(name="cousre")
public class Course {
	
	@Id
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="course_dur")
	private int courseDuration;
	
	@Column(name="course_fee")
	private double courseFee;
	
	@Column(name="faculty_name")
	private String facultyName;
	
	@ManyToMany
	@JoinTable(name="student_course_registration",joinColumns={@JoinColumn(name="course_name")}
	                                                           ,inverseJoinColumns= {@JoinColumn(name="stud_id")})
	List<Student> students;
	
	public Course() {}
	

	public Course(String courseName, int courseDuration, double courseFee, String facultyName, List<Student> students) {
		
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
		this.facultyName = facultyName;
		this.students = students;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public double getCourseFee() {
		return courseFee;
	}


	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}


	public String getFacultyName() {
		return facultyName;
	}


	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
}
