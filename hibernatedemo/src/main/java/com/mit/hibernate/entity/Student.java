package com.mit.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
    @Id
    @Column(name="stud_id")
    private int studentId;
    
    @Column(name="stud_name")
    private String studentName;
    
    @Column(name="stud_mobile")
    private long mobileNo;
    
    @Column(name="stud_add")
    private String studentAddress;
    
    @ManyToMany(mappedBy="students")
    private List<Course> courses;

    public Student () {}
    
	public Student(int studentId, String studentName, long mobileNo, String studentAddress, List<Course> courses) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.studentAddress = studentAddress;
		this.courses = courses;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
    
    
}
