package com.student.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Course {
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long course_id;

	    private String course_name;

	    private int credits;

	    private String department;

		public long getCourse_id() {
			return course_id;
		}

		public void setCourse_id(long course_id) {
			this.course_id = course_id;
		}

		public String getCourse_name() {
			return course_name;
		}

		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
	    

}
