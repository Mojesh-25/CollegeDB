package com.student.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long student_id;
	private String student_name;
	private String student_email;
	private long student_mobile;
	private String student_department;
	private int student_semester;
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public long getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(long student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_department() {
		return student_department;
	}
	public void setStudent_department(String student_department) {
		this.student_department = student_department;
	}
	public int getStudent_semester() {
		return student_semester;
	}
	public void setStudent_semester(int student_semester) {
		this.student_semester = student_semester;
	}
	

}
