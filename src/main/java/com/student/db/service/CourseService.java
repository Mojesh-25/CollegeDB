package com.student.db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.db.model.Course;
import com.student.db.repository.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    public Course findById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        courseRepository.deleteById(id);
    }
}