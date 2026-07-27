package com.student.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.db.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
