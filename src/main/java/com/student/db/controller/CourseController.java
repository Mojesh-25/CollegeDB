package com.student.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.db.model.Course;
import com.student.db.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String coursePage() {
        return "course";
    }

    @PostMapping("/add")
    public String addCourse(@ModelAttribute Course course) {

        Course savedData=courseService.addCourse(course);
        if(savedData != null) {
        	return "success";
        }
        else {

        return "redirect:/course";
        }
    }

}